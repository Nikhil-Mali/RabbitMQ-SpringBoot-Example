package com.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.entity.OrderDetails;
import com.rabbitmq.service.RabbitMQSenderService;

@RestController
@RequestMapping(value = "/rabbitmq/")
public class RabbitMQProducerController {

	@Autowired
	RabbitMQSenderService rabbitMQSender;

	@PostMapping(value = "/producer")
	public String producer(@RequestBody OrderDetails orderDetails) {
		rabbitMQSender.send(orderDetails);
		return "Message sent to the RabbitMQ JavaInUse Successfully";
	}
}
