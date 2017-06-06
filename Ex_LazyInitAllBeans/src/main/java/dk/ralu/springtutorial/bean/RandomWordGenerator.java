package dk.ralu.springtutorial.bean;

import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
class RandomWordGenerator {

    private static final Logger LOGGER = LoggerFactory.getLogger(RandomWordGenerator.class);

    String generateGreetingWord() {
        return Math.random() < 0.5 ? "Hi" : "Hello";
    }

    String generateLocationWord() {
        return Math.random() < 0.5 ? "World" : "Universe";
    }

    @PostConstruct
    private void outputInitialized() {
        LOGGER.info("Initialized " + getClass().getSimpleName());
    }
}
