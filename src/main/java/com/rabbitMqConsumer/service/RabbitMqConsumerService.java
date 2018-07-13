package com.rabbitMqConsumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.rabbitMqConsumer.entity.Employee;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RabbitMqConsumerService {
	
	@RabbitListener(queues="employee")
	  public void receive(Employee employee) {
	    log.info("Received message '{}'", employee);
	  }

	
}
