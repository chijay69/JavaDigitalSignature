package com.example.demo.datasource;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class TransactionManagerConfig {

    @Bean(name = "tm1")
    @Autowired
    @Primary
    public PlatformTransactionManager transactionManager1(@Qualifier("datasource1") DataSource dataSource1) {
        return new DataSourceTransactionManager(dataSource1);
    }

    @Bean(name = "tm2")
    @Autowired
    public PlatformTransactionManager transactionManager2(@Qualifier("datasource2") DataSource dataSource2) {
        return new DataSourceTransactionManager(dataSource2);
    }
}
