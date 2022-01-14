package software.xmclass.Software_engineering._course.mapper;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import software.xmclass.Software_engineering._course.domain.CommentModel;

import java.util.List;

@Repository
public interface CommentMapper {
    List<CommentModel> GetUComment(@Param("state") int state);
    int CheckComment(@Param("state") int state,@Param("id") int id);

}
