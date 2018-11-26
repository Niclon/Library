package com.vis.demo.configuration;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class DatabaseConfig {

    @Value("${spring.datasource.driver-class-name}") private String driverClassName;
    @Value("${spring.datasource.url}") private String connectionUrl;
    @Value("${spring.datasource.username}") private String username;
    @Value("${spring.jpa.show-sql}") private boolean showSql;
    @Value("${spring.jpa.properties.hibernate.dialect}") private String dialect;

    @Bean
    public DataSource dataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName(driverClassName);
        basicDataSource.setUrl(connectionUrl);
        basicDataSource.setUsername(username);
        basicDataSource.setAccessToUnderlyingConnectionAllowed(false);
        return basicDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource());
        sessionFactoryBean.setPackagesToScan("com.vis.demo");
        sessionFactoryBean.setAnnotatedPackages("com.vis.demo");
        Properties hibernateProperties = new Properties();
        hibernateProperties.put("hibernate.show_sql", showSql);
        hibernateProperties.put("hibernate.dialect", dialect);
        hibernateProperties.put("hibernate.hbm2ddl.auto", "none");
        hibernateProperties.put("hibernate.cache.use_query_cache", false);
        hibernateProperties.put("hibernate.cache.use_second_level_cache", false);
        sessionFactoryBean.setHibernateProperties(hibernateProperties);
        return sessionFactoryBean;
    }
}
