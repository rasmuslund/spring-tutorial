package dk.ralu.springtutorial.bean;

import dk.ralu.springtutorial.aop.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Timed
@Service
// All the methods is this bean is JOINPOINTS (places that can potentially be selected in a POINTCUT)
public class MessageGenerator {

    @Autowired
    private RandomWordGenerator randomWordGenerator;

    public String generateMessage() {
        return randomWordGenerator.generateGreetingWord() + " " + randomWordGenerator.generateLocationWord();
    }
}
