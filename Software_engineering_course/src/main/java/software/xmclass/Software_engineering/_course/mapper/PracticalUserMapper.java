package software.xmclass.Software_engineering._course.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import software.xmclass.Software_engineering._course.domain.PracticalUserModel;

@Repository
public interface PracticalUserMapper {
    PracticalUserModel findByID(@Param("PracticalUserID") int practicalID);

    String getName(int PracticalUserID);
}
