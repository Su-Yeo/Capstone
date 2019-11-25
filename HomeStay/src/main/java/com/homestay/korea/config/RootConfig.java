package com.homestay.korea.config;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = { "com.homestay.korea.service" })
@ComponentScan(basePackages = {"com.homestay.korea.util"})
@MapperScan(basePackages = { "com.homestay.korea.DAO" })

@EnableScheduling
@EnableTransactionManagement
public class RootConfig {
	
	@Bean
	public DataSource dataSource() {
		DataSource ds=new DataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://�ּ�?autoReconnect=true"); 
		ds.setUsername("capstone"); 
		ds.setPassword("capstone1234"); 
//		ds.setInitialSize(2);
//		ds.setMaxActive(10);
//		ds.setTestWhileIdle(true);
//		ds.setMinEvictableIdleTimeMillis(60000*3);
//		ds.setTimeBetweenEvictionRunsMillis(10*1000);
		return ds;
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource());
		return (SqlSessionFactory) sqlSessionFactory.getObject();
	}
	
	@Bean
	public SqlSession sqlSession() {
		SqlSessionTemplate template=null;
		try {
			template = new SqlSessionTemplate(sqlSessionFactory());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return template;
	}

	@Bean
	public DataSourceTransactionManager txManager() {
		return new DataSourceTransactionManager(dataSource());
	}

}	
