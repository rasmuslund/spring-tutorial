package dk.ralu.springtutorial.beans;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageGeneratorTest {

    @Autowired
    private MessageGenerator messageGenerator; // This bean depends on getting a RandomWordGenerated injected

    // Whatever beans this class defines, will be added to the beans that already exist
    @TestConfiguration
    public static class ExtraTestSpecificBeans {

        @Primary // Now two beans of type RandomWordGenerator exist - marking one as primary means it will be the one that gets injected
        @Bean
        RandomWordGenerator fixedRandomWordGenerator() {
            return new RandomWordGenerator() {
                @Override
                String generateGreetingWord() {
                    return "GREETING_WORD";
                }
                @Override
                String generateLocationWord() {
                    return "LOCATION_WORD";
                }
            };
        }
    }

    @Test
    public void generateMessage() {
        Assert.assertEquals("GREETING_WORD LOCATION_WORD", messageGenerator.generateMessage());
    }
}
