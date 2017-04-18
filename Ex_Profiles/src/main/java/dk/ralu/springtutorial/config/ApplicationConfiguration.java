package dk.ralu.springtutorial.config;

import dk.ralu.springtutorial.bean.MessageGenerator;
import dk.ralu.springtutorial.bean.RandomWordGenerator;
import dk.ralu.springtutorial.bean.RandomWordGeneratorProdImpl;
import dk.ralu.springtutorial.bean.RandomWordGeneratorTestImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ApplicationConfiguration {

    @Bean
    @Profile("test")
    public RandomWordGenerator randomWordTestGenerator() {
        return new RandomWordGeneratorTestImpl();
    }

    @Bean
    @Profile("!test") // ! means not
    public RandomWordGenerator randomWordProdGenerator() {
        return new RandomWordGeneratorProdImpl();
    }

    @Bean
    public MessageGenerator messageGenerator(RandomWordGenerator randomWordGenerator) {
        return new MessageGenerator(randomWordGenerator);
    }
}
