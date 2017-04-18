package dk.ralu.springtutorial;


import dk.ralu.springtutorial.bean.PersonRepository;
import dk.ralu.springtutorial.config.ApplicationConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        PersonRepository personRepository = context.getBean(PersonRepository.class);
        LOGGER.info("Person count: " + personRepository.countPersons());
    }
}
