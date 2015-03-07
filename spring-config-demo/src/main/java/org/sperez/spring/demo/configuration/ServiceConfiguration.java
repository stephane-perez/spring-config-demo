package org.sperez.spring.demo.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.sperez.spring.demo.services"})
public class ServiceConfiguration {

}
