package com.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.rabbitmq")
@ComponentScan({ "com.rabbitmq" })
@EntityScan(basePackages = {"com.rabbitmq"})
@EnableAutoConfiguration
public class RabbitMqProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqProducerApplication.class, args);
	}

}
