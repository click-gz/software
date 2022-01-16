package software.xmclass.Software_engineering._course.service;

import software.xmclass.Software_engineering._course.utils.JsonData;

import java.util.Map;

public interface OrderService {
    JsonData save(Map<String,String>info);

    JsonData OgetOrder(Map<String,Integer> info);
}
