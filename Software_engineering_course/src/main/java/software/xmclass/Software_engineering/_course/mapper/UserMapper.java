package software.xmclass.Software_engineering._course.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import software.xmclass.Software_engineering._course.domain.usermodel;

@Repository
public interface UserMapper {
    int save(usermodel user);
    usermodel findByPhoneAndPwd(@Param("phone") String phone, @Param("pwd") String pwd);
    usermodel findByPhone(@Param("phone") String phone);


}
