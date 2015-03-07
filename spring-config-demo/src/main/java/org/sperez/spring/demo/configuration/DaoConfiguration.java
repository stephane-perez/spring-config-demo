package org.sperez.spring.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("org.sperez.spring.demo.dao")
public class DaoConfiguration {

}
