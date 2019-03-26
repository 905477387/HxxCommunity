package com.hxxCommunity.configures;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession
public class SessionConfig 
{
	@Bean
	public JedisConnectionFactory connectionFactory()
	{
		JedisConnectionFactory connection = new JedisConnectionFactory();
		connection.setPort(6379);
		connection.setHostName("127.0.0.1");
		connection.setPassword("123456");
		return connection;
	}

}
