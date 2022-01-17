package software.xmclass.Software_engineering._course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import software.xmclass.Software_engineering._course.service.AdministratorService;
import software.xmclass.Software_engineering._course.utils.JsonData;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/pri/administrator")
public class AdministratorController {
    @Autowired
    private AdministratorService adminservice;

    //获取未审核的评论
    @PostMapping("GetComment")
    public JsonData GetComment(){
        return adminservice.GetComment();
    }

    //评论审核操作
    @PostMapping("CheckComment")
    public JsonData CheckComment(@RequestBody Map<String,String> info){
        int res = adminservice.CheckComment(info);
        if(res == -1){
            return JsonData.buildError(403,"lose Information");
        }else if (res == 0){
            return JsonData.buildError(403,"Missing Comment");
        }else{
            return JsonData.buildSuccess();
        }
    }

    //PU获取操作
    @PostMapping("GetPracticalUser")
    public JsonData CheckPracticalUser(){
        return adminservice.getPracticalUser();
    }

    //PU审核操作
    @PostMapping("CheckPracticalUser")
    public JsonData CheckPracticalUser(@RequestBody Map<String,String> info){
        int res = adminservice.CheckPracticalUser(info);
        if(res == -1){
            return JsonData.buildError(403,"lose Information");
        }else if (res == 0){
            return JsonData.buildError(403,"Missing Comment");
        }else{
            return JsonData.buildSuccess();
        }
    }
}
