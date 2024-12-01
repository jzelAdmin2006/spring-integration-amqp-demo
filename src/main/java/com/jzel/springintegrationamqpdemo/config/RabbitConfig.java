package com.jzel.springintegrationamqpdemo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

  @Bean
  public Queue myQueue() {
    return new Queue("testQueue", false);
  }
}
