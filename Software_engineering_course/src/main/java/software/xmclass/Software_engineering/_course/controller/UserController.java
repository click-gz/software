package software.xmclass.Software_engineering._course.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import software.xmclass.Software_engineering._course.domain.login.loginPwd;
import software.xmclass.Software_engineering._course.domain.usermodel;
import software.xmclass.Software_engineering._course.service.UserService;
import software.xmclass.Software_engineering._course.utils.JWTUtils;
import software.xmclass.Software_engineering._course.utils.JsonData;
import software.xmclass.Software_engineering._course.utils.SendMessCode;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/pri/user")
public class UserController {
    @Autowired
    private UserService userservice;
    //注册
    @PostMapping("register")
    public JsonData register(@RequestBody Map<String,String> userinfo){
        int res = userservice.save(userinfo);
        if (res == -1) {
            return JsonData.buildError(403, "lose Information");
        }
        else if (res == -2) {
            return JsonData.buildError(403, "exist Phone");
        }
        else if(res == 0){
            return JsonData.buildError(500, "error Mybatis");
        }else{
            loginPwd info= new loginPwd();
            info.setPhone(userinfo.get("phone"));
            info.setPwd(userinfo.get("pwd"));
            return userservice.loginpwd(info);
        }

    }

    //登录
    //---账号密码登录
    @PostMapping("loginP")
    public JsonData login(@RequestBody loginPwd loginRequest){
        return userservice.loginpwd(loginRequest);
    }

    //---验证码登录
    //-----发送验证码
    @RequestMapping("sendCode")
    public JsonData sendCode(@RequestBody Map<String,String> info){

        usermodel user = userservice.findByPhone(info.get("phone"));
        if(user==null) {
            return JsonData.buildError(403,"error Information");
        }

        try {
            String code = SendMessCode.main(info.get("phone"));
            user.setToken(code);
            user.setToken(JWTUtils.geneJsonWebToken(user,3));//3分钟过期
            if (user.getToken()==null) {
                return JsonData.buildError(500, "error JWT");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return JsonData.buildSuccess(200,user.getToken());

    }
    //----验证码登录
    @PostMapping("/loginC")
    public JsonData loginC(@RequestBody Map<String, String> info){
        if(info.containsKey("phone") && info.containsKey("code")){
            return userservice.loginCode(info);
        }else{
            return JsonData.buildError(403,"loss Information");
        }

    }
}
