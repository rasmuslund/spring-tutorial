package dk.ralu.springtutorial.bean;

import dk.ralu.springtutorial.aop.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RandomWordGenerator {

    // By injecting af reference to self, Spring will will actually inject a proxy
    @Autowired
    private RandomWordGenerator self;

    String generateGreetingWord() {
        // Call that doesn't go through the Spring generated proxy, so AOP won't work
        return randomBooleanV1() ? "Hi" : "Hello";
    }

    String generateLocationWord() {
        // Call that goes through the Spring generated proxy, so AOP works fine
        return self.randomBooleanV2() ? "World" : "Universe";
    }

    @Timed
    boolean randomBooleanV1() {
        return Math.random() < 0.5;
    }

    @Timed
    boolean randomBooleanV2() {
        return Math.random() < 0.5;
    }
}
