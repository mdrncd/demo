package com.example.demo;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.QueryLookupStrategy;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "demoEntityManagerFactory",
        transactionManagerRef = "demoTransactionManager",
        basePackages = "com.example.demo.repository",
        queryLookupStrategy = QueryLookupStrategy.Key.CREATE_IF_NOT_FOUND)
public class DemoDataSourceConfig {

    @Bean(name = "demoDataSourceProperties")
    @ConfigurationProperties(prefix = "demo.datasource")
    public DataSourceProperties demoDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name = "demoDataSource")
    @ConfigurationProperties(prefix = "demo.datasource.configuration")
    public HikariDataSource demoDataSource() {
        DataSourceProperties dataSourceProperties = demoDataSourceProperties();
        HikariDataSource dataSource = dataSourceProperties.initializeDataSourceBuilder()
                .driverClassName(dataSourceProperties.getDriverClassName())
                .url(dataSourceProperties.getUrl())
                .username(dataSourceProperties.getUsername())
                .password(dataSourceProperties.getPassword())
                .type(HikariDataSource.class)
                .build();

        return dataSource;
    }

    @Bean(name = "demoEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean demoEntityManagerFactory(HikariDataSource demoDataSource) {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(demoDataSource);
        em.setPersistenceUnitName("demo");
        em.setPackagesToScan("com.example.demo.entity");

        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);

        Properties properties = new Properties();
        properties.setProperty("database-platform", "org.hibernate.dialect.PostgreSQLDialect");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        properties.setProperty("hibernate.ddl-auto", "none");
        properties.setProperty("hibernate.default_schema", "demo");
        properties.setProperty("hibernate.use_sql_comments", "true");
        properties.setProperty("hibernate.criteria.literal_handling_mode", "bind");
        properties.setProperty("hibernate.show_sql", "true");
        properties.setProperty("hibernate.format_sql", "true");
        properties.setProperty("hibernate.hbm2ddl.auto", "validate");
        em.setJpaProperties(properties);

        return em;
    }

    @Bean(name = "demoTransactionManager")
    public PlatformTransactionManager demoTransactionManager(@Qualifier("demoEntityManagerFactory") LocalContainerEntityManagerFactoryBean demoEntityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager(demoEntityManagerFactory.getObject());

        return transactionManager;
    }
}

