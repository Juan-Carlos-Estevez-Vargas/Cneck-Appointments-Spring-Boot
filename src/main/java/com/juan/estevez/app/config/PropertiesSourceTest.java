package com.juan.estevez.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:test.yml")
@Profile("test")
public class PropertiesSourceTest {
}
