package software.xmclass.Software_engineering._course.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import software.xmclass.Software_engineering._course.domain.OgetOrder.OgetOrder;
import software.xmclass.Software_engineering._course.domain.OrderModel;
import software.xmclass.Software_engineering._course.domain.PgetOrder.PgetOrder;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderMapper {
    int save(OrderModel ordermodel);

    List<OgetOrder> OList(@Param("id") int id);
    OrderModel getOrder(@Param("id") int id);

    List<PgetOrder> PList(@Param("id") Integer PracticalUserID);

    void changeOrderState(@Param("id")Integer orderID,@Param("State") Integer state);

    void delOrder(@Param("id") Integer orderID);
}
