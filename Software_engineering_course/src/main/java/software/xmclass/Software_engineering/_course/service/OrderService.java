package software.xmclass.Software_engineering._course.service;

import software.xmclass.Software_engineering._course.utils.JsonData;

import java.util.Map;

public interface OrderService {
    JsonData save(Map<String,String>info);

    JsonData OgetOrder(Map<String,Integer> info);

    JsonData OgetOrder_Plus(Map<String,String> info);

    JsonData PgetOrder(Map<String,Integer> info);

    JsonData PgetOrder_Plus(Map<String,Integer> info);

    JsonData checkOrder(Map<String,Integer> info);

    JsonData DelOrder(Map<String,Integer> info);
}
