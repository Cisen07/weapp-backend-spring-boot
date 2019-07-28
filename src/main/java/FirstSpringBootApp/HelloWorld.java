package FirstSpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@EnableAutoConfiguration
// 让 Spring Boot 根据应用所声明的依赖来对 Spring 框架进行自动配置
// 这个注解告诉Spring Boot根据添加的jar依赖猜测你想如何配置Spring。
// 由于spring-boot-starter-web添加了Tomcat和Spring MVC，
// 所以auto-configuration将假定你正在开发一个web应用并相应地对Spring进行设置。

public class HelloWorld {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/hello")
    @ResponseBody
    String home1() {
        return "Hello World! Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorld.class, args);
    }
}