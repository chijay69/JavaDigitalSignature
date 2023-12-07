//package com.example.demo.datasource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.TransactionDefinition;
//import org.springframework.transaction.TransactionException;
//import org.springframework.transaction.TransactionStatus;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.transaction.annotation.TransactionManagementConfigurer;
//
//import javax.sql.DataSource;
//import java.util.Arrays;
//
//@Configuration
//@EnableTransactionManagement
//public class ChainedTransactionManagerConfig implements TransactionManagementConfigurer {
//
//    @Autowired
//    @Qualifier("datasource1")
//    private DataSource dataSource1;
//
//    @Autowired
//    @Qualifier("datasource2")
//    private DataSource dataSource2;
//
//    @Bean(name = "tm3")
//    public PlatformTransactionManager transactionManager1() {
//        return new DataSourceTransactionManager(dataSource1);
//    }
//
//    @Bean(name = "tm4")
//    public PlatformTransactionManager transactionManager2() {
//        return new DataSourceTransactionManager(dataSource2);
//    }
//
//    @Override
//    public PlatformTransactionManager annotationDrivenTransactionManager() {
//        return chainedTransactionManager(transactionManager1(), transactionManager2());
//    }
//
//    private PlatformTransactionManager chainedTransactionManager(PlatformTransactionManager... managers) {
//        return new PlatformTransactionManager() {
//            @Override
//            public void commit(TransactionStatus status) throws TransactionException {
//                Arrays.stream(managers).forEach(manager -> manager.commit(status));
//            }
//
//            @Override
//            public TransactionStatus getTransaction(TransactionDefinition definition) throws TransactionException {
//                throw new UnsupportedOperationException("ChainedTransactionManager does not support retrieving transaction status.");
//            }
//
//            @Override
//            public void rollback(TransactionStatus status) throws TransactionException {
//                for (int i = managers.length - 1; i >= 0; i--) {
//                    managers[i].rollback(status);
//                }
//            }
//        };
//    }
//}