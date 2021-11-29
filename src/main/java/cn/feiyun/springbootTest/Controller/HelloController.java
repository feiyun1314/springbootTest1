package cn.feiyun.springbootTest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/world")
    public String hello(){
        System.out.println("======hello world=======");
        return "hello";
    }
}
