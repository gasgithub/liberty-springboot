package application.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibertyHelloController {

    @RequestMapping("/springbootweb")
    public String hello() {
    	System.out.println(System.getProperty("default.http.port"));
    	System.out.println(System.getProperty("bulba"));
    	System.out.println(System.getProperty("bulbaBP"));
    	System.out.println(System.getenv("my_env"));
        return "Hello from Spring Boot MVC running on Liberty!";
    }

}
