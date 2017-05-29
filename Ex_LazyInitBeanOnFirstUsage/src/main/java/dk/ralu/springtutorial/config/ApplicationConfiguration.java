package dk.ralu.springtutorial.config;

import dk.ralu.springtutorial.bean.MessageGenerator;
import dk.ralu.springtutorial.bean.RandomWordGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
public class ApplicationConfiguration {

    // Lazy on its own postpones init of the bean till it is first injected or looked up.
    // Lazy and proxy mode target class creates a lazy proxy (used for injection and lookup), while the actual instance is not created until
    // someone makes the first invocation of a method on the bean.
    @Bean
    @Lazy
    @Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
    public RandomWordGenerator randomWordGenerator() {
        return new RandomWordGenerator();
    }

    @Bean
    public MessageGenerator messageGenerator(RandomWordGenerator randomWordGenerator) {
        return new MessageGenerator(randomWordGenerator);
    }
}
