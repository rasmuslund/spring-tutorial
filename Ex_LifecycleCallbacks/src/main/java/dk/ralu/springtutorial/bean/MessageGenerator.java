package dk.ralu.springtutorial.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageGenerator {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageGenerator.class);

    @Autowired
    private RandomWordGenerator randomWordGenerator;

    public String generateMessage() {
        return randomWordGenerator.generateGreetingWord() + " " + randomWordGenerator.generateLocationWord();
    }

    @PostConstruct
    private void onInit() {
        LOGGER.info("MessageGenerator.onInit() was called (injection has happened? " + (randomWordGenerator != null) + ")");
    }

    @PreDestroy
    private void onDestroy() {
        LOGGER.info("MessageGenerator.onDestroy() was called");
    }
}
