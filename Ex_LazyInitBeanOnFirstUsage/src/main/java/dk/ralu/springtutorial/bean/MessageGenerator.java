package dk.ralu.springtutorial.bean;

import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageGenerator {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageGenerator.class);

    private final RandomWordGenerator randomWordGenerator;

    @PostConstruct
    private void postConstruct() {
        LOGGER.info("Created " + getClass().getCanonicalName());
    }

    public MessageGenerator(RandomWordGenerator randomWordGenerator) {
        this.randomWordGenerator = randomWordGenerator;
    }

    public String generateMessage() {
        return randomWordGenerator.generateGreetingWord() + " " + randomWordGenerator.generateLocationWord();
    }
}
