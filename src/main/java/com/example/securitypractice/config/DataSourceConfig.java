package com.example.securitypractice.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


@Slf4j
@Configuration
public class DataSourceConfig {

    @Autowired
    DbConfigProperties dbConfigProperties; // 의존성 주입받아 getter로 값을 받아옴

    @Bean
    public DataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername(dbConfigProperties.getUsername());
        dataSource.setPassword(dbConfigProperties.getPassword());
        dataSource.setUrl(dbConfigProperties.getUrl());
        dataSource.setDriverClassName(dbConfigProperties.getDriverClassName());
        return dataSource;
    }

}
