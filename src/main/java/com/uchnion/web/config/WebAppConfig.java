package com.uchnion.web.config;

import java.util.Properties;
import javax.annotation.Resource;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan("com.uchnion.web")
@EnableWebMvc
@EnableTransactionManagement
@PropertySource("classpath:configuration.properties")
public class WebAppConfig extends WebMvcConfigurerAdapter {

    private static final String PROPERTY_NAME_DATABASE_DRIVER = "db.driver";
    private static final String PROPERTY_NAME_DATABASE_PASSWORD = "db.password";
    private static final String PROPERTY_NAME_DATABASE_URL = "db.url";
    private static final String PROPERTY_NAME_DATABASE_USERNAME = "db.username";

    private static final String PROPERTY_NAME_HIBERNATE_DIALECT = "hibernate.dialect";
    private static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "hibernate.show_sql";
    private static final String PROPERTY_NAME_HIBERNATE_HBM2DDL = "hibernate.hbm2ddl.auto";
    private static final String PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN = "entitymanager.packages.to.scan";

    private static final String PROPERTY_NAME_HIBERNATE_C3P0_MIN_SIZE = "hibernate.c3p0.min_size";
    private static final String PROPERTY_NAME_HIBERNATE_C3P0_MAX_SIZE = "hibernate.c3p0.max_size";
    private static final String PROPERTY_NAME_HIBERNATE_C3P0_TIMEOUT = "hibernate.c3p0.timeout";
    private static final String PROPERTY_NAME_HIBERNATE_C3P0_MAX_STATEMENTS = "hibernate.c3p0.max_statements";
    private static final String PROPERTY_NAME_HIBERNATE_C3P0_IDLE_TEST_PERIOD = "hibernate.c3p0.idle_test_period";

    @Resource
    private Environment env;

    private Properties hibernateProperties() {
        Properties prop = new Properties();
        //hibernate properties
        prop.put(PROPERTY_NAME_HIBERNATE_DIALECT, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_DIALECT));
        prop.put(PROPERTY_NAME_HIBERNATE_SHOW_SQL, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_SHOW_SQL));
        prop.put(PROPERTY_NAME_HIBERNATE_HBM2DDL, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_HBM2DDL));

        //c3p0 pooling properties
        prop.put(PROPERTY_NAME_HIBERNATE_C3P0_MIN_SIZE, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_C3P0_MIN_SIZE));
        prop.put(PROPERTY_NAME_HIBERNATE_C3P0_MAX_SIZE, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_C3P0_MAX_SIZE));
        prop.put(PROPERTY_NAME_HIBERNATE_C3P0_TIMEOUT, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_C3P0_TIMEOUT));
        prop.put(PROPERTY_NAME_HIBERNATE_C3P0_MAX_STATEMENTS, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_C3P0_MAX_STATEMENTS));
        prop.put(PROPERTY_NAME_HIBERNATE_C3P0_IDLE_TEST_PERIOD, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_C3P0_IDLE_TEST_PERIOD));
        return prop;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getRequiredProperty(PROPERTY_NAME_DATABASE_DRIVER));
        dataSource.setUrl(env.getRequiredProperty(PROPERTY_NAME_DATABASE_URL));
        dataSource.setUsername(env.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME));
        dataSource.setPassword(env.getRequiredProperty(PROPERTY_NAME_DATABASE_PASSWORD));
        return dataSource;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
        lsfb.setDataSource(this.dataSource());
        lsfb.setPackagesToScan(env.getRequiredProperty(PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN));
        lsfb.setHibernateProperties(this.hibernateProperties());
        return lsfb;
    }

    @Bean
    public HibernateTransactionManager transactionManager() {
        return new HibernateTransactionManager(this.sessionFactory().getObject());
    }

    @Bean
    public UrlBasedViewResolver setupViewResolver() {
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix("/WEB-INF/view/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assets/**").addResourceLocations("/statics/");
    }

}
