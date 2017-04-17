package dk.ralu.springtutorial.bean;

public class RandomWordGenerator {

    String generateGreetingWord() {
        return Math.random() < 0.5 ? "Hi" : "Hello";
    }

    String generateLocationWord() {
        return Math.random() < 0.5 ? "World" : "Universe";
    }
}
