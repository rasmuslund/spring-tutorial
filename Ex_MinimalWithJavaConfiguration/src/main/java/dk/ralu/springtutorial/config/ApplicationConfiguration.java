package dk.ralu.springtutorial.config;

import dk.ralu.springtutorial.bean.MessageGenerator;
import dk.ralu.springtutorial.bean.RandomWordGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Signals that this class contains Spring configuration
@Configuration
public class ApplicationConfiguration {

    // Defines a bean of the type RandomWordGenerator with the name randomWordGenerator (the name of the method)
    @Bean
    public RandomWordGenerator randomWordGenerator() {
        return new RandomWordGenerator();
    }

    // Defines yet another bean, but this bean expects to get a reference to a RandomWordGenerator bean injected.
    // With Java config we tell Spring that our beans expects an injection by declaring the dependencies as method parameters.
    // Spring will know that it has to create the RandomWordGenerator bean before creating this bean (calculates a dependency graph).
    @Bean
    public MessageGenerator messageGenerator(RandomWordGenerator randomWordGenerator) {
        return new MessageGenerator(randomWordGenerator);
    }
}
