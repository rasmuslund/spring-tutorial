package dk.ralu.springtutorial.config;

import dk.ralu.springtutorial.bean.MessageGenerator;
import dk.ralu.springtutorial.bean.RandomWordGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public RandomWordGenerator randomWordGenerator() {
        return new RandomWordGenerator();
    }

    // Note that this bean needs a reference to the RandomWordGenerator bean, which means we add it as a parameter.
    // Spring will know that it has to create the RandomWordGenerator bean before creating this bean (calculates a dependency graph).
    @Bean
    public MessageGenerator messageGenerator(RandomWordGenerator randomWordGenerator) {
        return new MessageGenerator(randomWordGenerator);
    }
}
