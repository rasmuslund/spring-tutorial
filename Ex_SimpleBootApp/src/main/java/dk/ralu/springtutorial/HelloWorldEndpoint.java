package dk.ralu.springtutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldEndpoint {

    @RequestMapping("/greeting")
    public String index() {
        return "Hello universe!";
    }

}
