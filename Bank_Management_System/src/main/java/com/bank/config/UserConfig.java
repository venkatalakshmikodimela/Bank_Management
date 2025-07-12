package com.bank.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.bank")
//It is used to show the path of the Repository for injucting the proxy class beank
@EnableJpaRepositories("com.bank.repository")
public class UserConfig
{
	@Bean
	public  InternalResourceViewResolver viewResolverBean()
	{
		InternalResourceViewResolver internalResourceViewResolver = new  InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}
	
	@Bean(name="entityManagerFactory")
	public LocalEntityManagerFactoryBean localEntityManagerFactoryBean()
	{
		LocalEntityManagerFactoryBean localEntityManagerFactoryBean = 
				new LocalEntityManagerFactoryBean();
		localEntityManagerFactoryBean.setPersistenceUnitName("Bank_Management_System");
		return localEntityManagerFactoryBean;
	}
	
	@Bean(name="transactionManager")
	public  JpaTransactionManager jpaTransactionManagerBean(EntityManagerFactory emf)
	{
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(emf);
		return jpaTransactionManager;
	}
}
