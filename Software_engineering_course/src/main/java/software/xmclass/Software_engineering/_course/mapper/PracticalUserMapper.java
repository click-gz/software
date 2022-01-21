package software.xmclass.Software_engineering._course.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import software.xmclass.Software_engineering._course.domain.PracticalUserList.PracticalUserSingle;
import software.xmclass.Software_engineering._course.domain.PracticalUserModel;
import software.xmclass.Software_engineering._course.utils.JsonData;

import java.util.List;

@Repository
public interface PracticalUserMapper {
    PracticalUserModel findByID(@Param("PracticalUserID") int practicalID);

    String getName(int PracticalUserID);

    List<PracticalUserModel> GetUPracticalUser(@Param("state") int i);

    int CheckPracticalUser(@Param("state") int state,@Param("id") int id);

    List<PracticalUserSingle> getList(@Param("state") int i);
}
