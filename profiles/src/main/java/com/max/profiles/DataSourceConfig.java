package com.max.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataSourceConfig {

    @Bean(name = "datasource")
    @Profile("development")
    DataSource development() {
        return new DataSource("my-dev-url", 9999);
    }

    @Bean(name = "datasource")
    @Profile("production")
    DataSource production() {
        return new DataSource("my-prod-url", 6306);
    }

    @Bean(name = "datasource")
    DataSource test() {
        return new DataSource("my-prod-url", 6306);
    }

}
