package dk.ralu.springtutorial.bean;

import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomWordGenerator {

    private static final Logger LOGGER = LoggerFactory.getLogger(RandomWordGenerator.class);

    @PostConstruct
    private void postConstruct() {
        LOGGER.info("Created " + getClass().getCanonicalName());
    }

    String generateGreetingWord() {
        return Math.random() < 0.5 ? "Hi" : "Hello";
    }

    String generateLocationWord() {
        return Math.random() < 0.5 ? "World" : "Universe";
    }
}
