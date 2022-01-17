package software.xmclass.Software_engineering._course.service;

import software.xmclass.Software_engineering._course.utils.JsonData;

import java.util.Map;

public interface AdministratorService {
    JsonData GetComment();

    int CheckComment(Map<String,String> info);



    JsonData getPracticalUser();

    int CheckPracticalUser(Map<String,String> info);
}
