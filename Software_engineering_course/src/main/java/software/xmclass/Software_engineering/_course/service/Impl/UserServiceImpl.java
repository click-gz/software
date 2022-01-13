package software.xmclass.Software_engineering._course.service.Impl;

import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.xmclass.Software_engineering._course.domain.login.loginPwd;
import software.xmclass.Software_engineering._course.domain.usermodel;
import software.xmclass.Software_engineering._course.mapper.UserMapper;
import software.xmclass.Software_engineering._course.service.UserService;
import software.xmclass.Software_engineering._course.utils.CommonUtils;
import software.xmclass.Software_engineering._course.utils.JWTUtils;
import software.xmclass.Software_engineering._course.utils.JsonData;

import java.util.Date;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper usermapper;
    @Autowired
    private UserService userservice;

    @Override
    public int save(Map<String,String> info) {
        usermodel user=parseToUser(info);
        if(user==null){
            //信息不全
            return -1;
        }
        if(usermapper.findByPhone(user.getPhone())!=null){
            //手机号重复
            return -2;
        }
        //成功则返回1，生效行数
        return usermapper.save(user);
    }

    @Override
    public JsonData loginpwd(loginPwd info) {
        usermodel PerInfo = userservice.findByPhoneAndPwd(info.getPhone(), info.getPwd());
        if(PerInfo==null) {
            //未找到
            return JsonData.buildError(403,"error phone or password");
        }
        PerInfo.setToken("");
        PerInfo.setToken(JWTUtils.geneJsonWebToken(PerInfo));
        if (PerInfo.getToken()==null) {
            return JsonData.buildError(500,"error JWT");//500 服务器出错
        } else {
            return JsonData.buildSuccess(200,PerInfo);
        }
    }

    @Override
    public usermodel findByPhoneAndPwd(String phone, String pwd) {
        return usermapper.findByPhoneAndPwd(phone,CommonUtils.MD5(pwd));
    }

    @Override
    public usermodel findByPhone(String phone) {
        return usermapper.findByPhone(phone);
    }

    @Override
    public JsonData loginCode(Map<String, String> info) {
        String token = info.get("token");
        String code = info.get("code");
        String phone = info.get("phone");
        //check token
        Claims claims = JWTUtils.checkJWT(token);
        if (claims == null) {
            //不放行，则需要给前端数据，这里封装一个方法传送错误信息
            return   JsonData.buildError(401,"验证码过期,重新获取");
        }
        String phone_check = (String) claims.get("phone");
        String code_check = (String) claims.get("code");
        if(phone.equals(phone_check) && code.equals(code_check)){
            usermodel User = usermapper.findByPhone(phone);
            User.setToken("");
            User.setToken(JWTUtils.geneJsonWebToken(User));
            if (User.getToken()==null) {
                return JsonData.buildError(500,"error JWT");//500 服务器出错
            } else {
                return JsonData.buildSuccess(200, User);
            }
        }else{
            return JsonData.buildError(403,"error code or phone");
        }
    }

    public usermodel parseToUser(Map<String,String> info){
        if(info.containsKey("phone") && info.containsKey("pwd")){
            usermodel user=new usermodel();
            user.setPhone(info.get("phone"));
            user.setCreateTime(new Date());
            String pwd=info.get("pwd");
            //MD5加密
            user.setPwd(CommonUtils.MD5(pwd));
            return user;
        }else{
            return null;
        }
    }

}
