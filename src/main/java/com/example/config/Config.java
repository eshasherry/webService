package com.example.config;


import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by esherry on 2018-02-25.
 */
@Configuration
public class Config {

    @Bean
    public JdbcTemplate userJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    @Bean @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource getDataSource(){
        return DataSourceBuilder.create().build();
    }
}
