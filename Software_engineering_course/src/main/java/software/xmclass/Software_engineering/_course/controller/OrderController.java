package software.xmclass.Software_engineering._course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import software.xmclass.Software_engineering._course.service.AdministratorService;
import software.xmclass.Software_engineering._course.service.OrderService;
import software.xmclass.Software_engineering._course.utils.JsonData;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/pri/Order")
public class OrderController {
    @Autowired
    OrderService Oservice;

    @PostMapping("save")
    public JsonData OrderSave(@RequestBody Map<String,String> info){

        return Oservice.save(info);
    }

    @PostMapping("OgetOrder")
    public JsonData OgetOrder(@RequestBody Map<String,Integer> info){
        return Oservice.OgetOrder(info);
    }
}
