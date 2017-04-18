package dk.ralu.springtutorial.bean;

public class RandomWordGeneratorProdImpl implements RandomWordGenerator {

    @Override
    public String generateGreetingWord() {
        return Math.random() < 0.5 ? "Hi" : "Hello";
    }

    @Override
    public String generateLocationWord() {
        return Math.random() < 0.5 ? "World" : "Universe";
    }
}
