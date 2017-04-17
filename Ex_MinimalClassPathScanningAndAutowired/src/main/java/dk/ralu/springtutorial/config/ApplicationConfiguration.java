package dk.ralu.springtutorial.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("dk.ralu.springtutorial") // By default scans in own package and sub packages
public class ApplicationConfiguration {

}
