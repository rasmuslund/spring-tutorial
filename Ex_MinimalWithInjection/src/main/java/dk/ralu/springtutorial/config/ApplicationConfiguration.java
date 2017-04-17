package dk.ralu.springtutorial.config;

import dk.ralu.springtutorial.bean.MessageGenerator;
import dk.ralu.springtutorial.bean.RandomWordGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public MessageGenerator messageGenerator() {
        return new MessageGenerator();
    }

    @Bean
    public RandomWordGenerator randomWordGenerator() {
        return new RandomWordGenerator();
    }
}
