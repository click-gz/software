package software.xmclass.Software_engineering._course.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.xmclass.Software_engineering._course.domain.AdministratorModel;
import software.xmclass.Software_engineering._course.domain.OgetOrder.OgetOrder;
import software.xmclass.Software_engineering._course.domain.OrderModel;
import software.xmclass.Software_engineering._course.domain.PracticalUserModel;
import software.xmclass.Software_engineering._course.domain.usermodel;
import software.xmclass.Software_engineering._course.mapper.OrderMapper;
import software.xmclass.Software_engineering._course.mapper.PracticalUserMapper;
import software.xmclass.Software_engineering._course.mapper.UserMapper;
import software.xmclass.Software_engineering._course.service.OrderService;
import software.xmclass.Software_engineering._course.utils.JsonData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private PracticalUserMapper practicalusermapper;

    @Autowired
    private UserMapper usermapper;

    @Autowired
    private OrderMapper ordermapper;

    @Override
    public JsonData save(Map<String, String> info) {
        if(info.containsKey("OrdinaryID") && info.containsKey("PracticalID") && info.containsKey("Price")){
            PracticalUserModel PUM = practicalusermapper.findByID(Integer.parseInt(info.get("PracticalID")));
            if(PUM == null){
                return JsonData.buildError(403, "error PracticalID");
            }else{
                System.out.println(PUM);
                usermodel user = usermapper.findById(Integer.parseInt(info.get("OrdinaryID")));
                if(user == null){
                    return JsonData.buildError(403,"error OrdinaryID");
                }else {
                    System.out.println(user);
                    OrderModel ordermodel= new OrderModel();
                    ordermodel.setOrderState(0);
                    ordermodel.setOrderTime(new Date());
                    ordermodel.setOrdinaryUserID(Integer.parseInt(info.get("OrdinaryID")));
                    ordermodel.setPayState(0);
                    ordermodel.setPracticalUserID(Integer.parseInt(info.get("PracticalID")));
                    ordermodel.setPrice(Float.parseFloat(info.get("Price")));
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String dateStr = info.get("Time");
                    Date date = new Date();
                    try {
                        date = simpleDateFormat.parse(dateStr);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    ordermodel.setOTime(date);
                    int res = ordermapper.save(ordermodel);
                    if(res == 0){
                        return JsonData.buildError(500,"error Mybatis");
                    }else{
                        return JsonData.buildSuccess();
                    }
                }
            }
        }
        return JsonData.buildError(403, "lose Information");
    }

    @Override
    public JsonData OgetOrder(Map<String, Integer> info) {
        if(info.containsKey("OrdinaryID")){
            List<OgetOrder> res = ordermapper.OgetbyId(info.get("OrdinaryID"));
            for(int i=0;i<res.size();i++){
                res.get(i).setName(practicalusermapper.getName(res.get(i).getPracticalUserID()));
            }
            System.out.println(res);
            return JsonData.buildSuccess(200,res);
        }
        return JsonData.buildError(403,"loss Information");
    }
}
