package software.xmclass.Software_engineering._course.service;

import software.xmclass.Software_engineering._course.domain.login.loginPwd;
import software.xmclass.Software_engineering._course.domain.usermodel;
import software.xmclass.Software_engineering._course.utils.JsonData;

import java.util.Map;

public interface UserService {
    int save(Map<String,String> info);
    JsonData loginpwd(loginPwd info);
    usermodel findByPhoneAndPwd(String phone, String pwd);
    usermodel findByPhone(String phone);
    JsonData loginCode(Map<String,String> info);


    JsonData checkToken(Map<String,String> info);
}
