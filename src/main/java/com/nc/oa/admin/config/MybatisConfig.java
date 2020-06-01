package com.nc.oa.admin.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * Mybatis配置
 * @author robin
 * @date May 29, 2020
 */
@Configuration
@MapperScan("com.nc.oa.*.dao")	// 扫描DAO
public class MybatisConfig {
  @Autowired
  private DataSource dataSource;

  @Bean
  public SqlSessionFactory sqlSessionFactory() throws Exception {
    SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
    sessionFactory.setDataSource(dataSource);
    sessionFactory.setTypeAliasesPackage("com.nc.oa.*.model");	// 扫描Model
    
	PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
	sessionFactory.setMapperLocations(resolver.getResources("classpath*:**/sqlmap/*.xml"));	// 扫描映射文件
	
    return sessionFactory.getObject();
  }
}