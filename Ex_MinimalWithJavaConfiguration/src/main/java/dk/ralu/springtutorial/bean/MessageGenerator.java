package dk.ralu.springtutorial.bean;

public class MessageGenerator {

    private final RandomWordGenerator randomWordGenerator;

    public MessageGenerator(RandomWordGenerator randomWordGenerator) {
        this.randomWordGenerator = randomWordGenerator;
    }


    public String generateMessage() {
        return randomWordGenerator.generateGreetingWord() + " " + randomWordGenerator.generateLocationWord();
    }
}
