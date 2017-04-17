package dk.ralu.springtutorial.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(value = "dk.ralu.springtutorial")
public class ApplicationConfiguration {

}
