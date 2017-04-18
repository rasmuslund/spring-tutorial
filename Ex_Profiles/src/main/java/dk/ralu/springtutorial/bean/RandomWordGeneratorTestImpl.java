package dk.ralu.springtutorial.bean;

public class RandomWordGeneratorTestImpl implements RandomWordGenerator {

    @Override
    public String generateGreetingWord() {
        return "TEST GREETING";
    }

    @Override
    public String generateLocationWord() {
        return "TEST LOCATION";
    }
}
