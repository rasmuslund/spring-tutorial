package dk.ralu.springtutorial.bean;

public class MessageGenerator {

    private RandomWordGenerator randomWordGenerator;

    public void setRandomWordGenerator(RandomWordGenerator randomWordGenerator) {
        this.randomWordGenerator = randomWordGenerator;
    }

    public String generateMessage() {
        return randomWordGenerator.generateGreetingWord() + " " + randomWordGenerator.generateLocationWord();
    }
}
