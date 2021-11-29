package cn.feiyun.springbootTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
public class SpringbootTestApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootTestApplication.class, args);
    }

}
