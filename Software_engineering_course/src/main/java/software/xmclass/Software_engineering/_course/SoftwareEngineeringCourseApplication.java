package software.xmclass.Software_engineering._course;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@SpringBootApplication
@MapperScan("software.xmclass.Software_engineering._course.mapper")
public class SoftwareEngineeringCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoftwareEngineeringCourseApplication.class, args);
	}

}
