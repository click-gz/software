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
    OrderService orderservice;

    @PostMapping("save")
    public JsonData OrderSave(@RequestBody Map<String,String> info){

        return orderservice.save(info);
    }

    @PostMapping("OgetOrder")
    public JsonData OgetOrder(@RequestBody Map<String,Integer> info){
        return orderservice.OgetOrder(info);
    }

    @PostMapping("OgetOrder_Plus")
    public JsonData OgetOrder_Plus(@RequestBody Map<String , String> info){
        return orderservice.OgetOrder_Plus(info);
    }
    
    @PostMapping("PgetOrder")
    public JsonData PgetOrder(@RequestBody Map<String,Integer> info){
        return orderservice.PgetOrder(info);
    }

    @PostMapping("PgetOrder_Plus")
    public JsonData PgetOrder_Plus(@RequestBody Map<String,Integer> info){
        return orderservice.PgetOrder_Plus(info);
    }

    @PostMapping("check_order")
    public JsonData checkOrder(@RequestBody Map<String , Integer>info){
        return orderservice.checkOrder(info);
    }

    @RequestMapping("DelOrder")
    public JsonData DelOrder(@RequestBody Map<String,Integer>info){
        return orderservice.DelOrder(info);
    }



}
