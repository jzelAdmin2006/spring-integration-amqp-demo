package com.jzel.springintegrationamqpdemo.adapter.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

  @RabbitListener(queues = "testQueue")
  public void receiveMessage(final String message) {
    System.out.println("Received <" + message + ">");
  }
}
