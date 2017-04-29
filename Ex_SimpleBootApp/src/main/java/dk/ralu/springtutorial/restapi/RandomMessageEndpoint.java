package dk.ralu.springtutorial.restapi;

import dk.ralu.springtutorial.beans.MessageGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomMessageEndpoint {

    @Autowired
    private MessageGenerator messageGenerator;

    @RequestMapping("/messages/random")
    public String index() {
        return messageGenerator.generateMessage();
    }
}
