package software.xmclass.Software_engineering._course.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import software.xmclass.Software_engineering._course.domain.OgetOrder.OgetOrder;
import software.xmclass.Software_engineering._course.domain.OrderModel;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderMapper {
    int save(OrderModel ordermodel);

    List<OgetOrder> OgetbyId(@Param("id") int id);
}
