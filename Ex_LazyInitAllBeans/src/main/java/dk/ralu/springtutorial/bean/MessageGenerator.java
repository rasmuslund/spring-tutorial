package dk.ralu.springtutorial.bean;

import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageGenerator {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageGenerator.class);

    public String generateMessage() {
        return (Math.random() < 0.5) ? "Random message 1" : "Random message 2";
    }

    @PostConstruct
    private void outputInitialized() {
        LOGGER.info("Initialized " + getClass().getSimpleName());
    }
}
