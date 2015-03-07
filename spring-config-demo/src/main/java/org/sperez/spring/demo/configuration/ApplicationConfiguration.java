package org.sperez.spring.demo.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Import;

@Configurable
@Import(value = { DataSourceConfiguration.class, DaoConfiguration.class, WsContextConfiguration.class })
public class ApplicationConfiguration {

}
