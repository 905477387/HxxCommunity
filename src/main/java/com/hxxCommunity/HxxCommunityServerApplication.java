package com.hxxCommunity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @Title: HxxCommunityServerApplication.java
 * @Package: com.hxxCommunity
 * @Description:  主启动类
 * @author: luolight
 * @date: 2019年3月26日 上午10:48:06
 * @version 0.1
 */

@EnableAutoConfiguration//加载配置
@EnableEurekaClient
@SpringBootApplication//SpringBoot启动
@MapperScan("com.hxxCommunity.mappers")//扫描所有Mapper
@ServletComponentScan//扫描可用的自定义注解
public class HxxCommunityServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HxxCommunityServerApplication.class, args);
	}
}
