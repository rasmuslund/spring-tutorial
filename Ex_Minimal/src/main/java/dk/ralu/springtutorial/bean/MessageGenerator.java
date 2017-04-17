package dk.ralu.springtutorial.bean;

public class MessageGenerator {

    public String generateMessage() {
        if (Math.random() < 0.5) {
            return "Hello world";
        } else {
            return "Hi universe!";
        }
    }
}
