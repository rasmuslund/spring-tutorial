package dk.ralu.springtutorial.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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
    private void onInit() {
        LOGGER.info("RandomWordGenerator.onInit() was called");
    }

    @PreDestroy
    private void onDestroy() {
        LOGGER.info("RandomWordGenerator.onDestroy() was called");
    }
}
