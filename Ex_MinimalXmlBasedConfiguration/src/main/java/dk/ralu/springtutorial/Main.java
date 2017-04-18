package dk.ralu.springtutorial;


import dk.ralu.springtutorial.bean.MessageGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/beans.xml");
        MessageGenerator springBean = context.getBean(MessageGenerator.class);
        LOGGER.info(springBean.generateMessage());
    }
}