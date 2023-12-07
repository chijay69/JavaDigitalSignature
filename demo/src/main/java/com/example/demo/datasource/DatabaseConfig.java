package com.example.demo.datasource;
import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DatabaseConfig {

    @Bean(name = "datasource1")
    @ConfigurationProperties("spring.datasource.db1")
    @Primary
    public DataSource dataSource1() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "datasource2")
    @ConfigurationProperties("spring.datasource.db2")
    public DataSource dataSource2() {
        return DataSourceBuilder.create().build();
    }
}
