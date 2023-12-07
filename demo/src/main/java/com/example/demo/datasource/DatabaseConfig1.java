//package com.example.demo.datasource;
//
//import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.transaction.annotation.TransactionManagementConfigurer;
//import javax.sql.DataSource;
//
//@Configuration
//@EnableTransactionManagement
//public class DatabaseConfig implements TransactionManagementConfigurer {
//
//    @Bean(name = "datasource1")
//    @ConfigurationProperties("database1.datasource")
//    @Primary
//    public DataSource dataSource1() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "datasource2")
//    @ConfigurationProperties("database2.datasource")
//    public DataSource dataSource2() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "tm1")
//    @Primary
//    public DataSourceTransactionManager tm1() {
//        return new DataSourceTransactionManager(dataSource1());
//    }
//
//    @Bean(name = "tm2")
//    public DataSourceTransactionManager tm2() {
//        return new DataSourceTransactionManager(dataSource2());
//    }
//
//    @Override
//    public PlatformTransactionManager annotationDrivenTransactionManager() {
//        return new ChainedTransactionManager(tm1(), tm2());
//    }
//}
