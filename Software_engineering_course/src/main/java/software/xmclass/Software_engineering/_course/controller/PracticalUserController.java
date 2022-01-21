package software.xmclass.Software_engineering._course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import software.xmclass.Software_engineering._course.service.PracticalUserService;
import software.xmclass.Software_engineering._course.utils.JsonData;

@RestController
@RequestMapping("/api/v1/pri/PracticalUser")
public class PracticalUserController {

    @Autowired
    PracticalUserService pS;
    @GetMapping("getPracticalUserTop")
    public JsonData getPracticalUserTop(){

        return pS.getList(0);
    }
    @GetMapping("getPracticalUserList")
    public JsonData getPracticalUserList(){
        return pS.getList(1);
    }

}