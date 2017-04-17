package dk.ralu.springtutorial.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageGenerator {

    // Field Injection
    @Autowired
    private RandomWordGenerator randomWordGenerator;

    // Setter Injection
    /*
    private RandomWordGenerator randomWordGenerator;

    @Autowired
    public void setRandomWordGenerator(RandomWordGenerator randomWordGenerator) {
        this.randomWordGenerator = randomWordGenerator;
    }
    */

    // Constructor Injection
    /*
    private final RandomWordGenerator randomWordGenerator;

    @Autowired
    public MessageGenerator(RandomWordGenerator randomWordGenerator) {
        this.randomWordGenerator = randomWordGenerator;
    }
    */

    public String generateMessage() {
        return randomWordGenerator.generateGreetingWord() + " " + randomWordGenerator.generateLocationWord();
    }
}
