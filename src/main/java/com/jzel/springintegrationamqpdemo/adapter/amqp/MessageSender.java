package com.jzel.springintegrationamqpdemo.adapter.amqp;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MessageSender {

  private final RabbitTemplate template;

  public void send(final String message) {
    template.convertAndSend("testQueue", message);
  }
}
