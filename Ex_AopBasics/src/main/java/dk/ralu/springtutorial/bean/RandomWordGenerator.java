package dk.ralu.springtutorial.bean;

import dk.ralu.springtutorial.aop.Timed;
import org.springframework.stereotype.Service;

@Service
public class RandomWordGenerator {

    @Timed
    String generateGreetingWord() {
        return Math.random() < 0.5 ? "Hi" : "Hello";
    }

    String generateLocationWord() {
        return Math.random() < 0.5 ? "World" : "Universe";
    }
}
