package com.jzel.springintegrationamqpdemo.adapter.rest;

import com.jzel.springintegrationamqpdemo.adapter.amqp.MessageSender;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

  private final MessageSender sender;

  @GetMapping("/send")
  public String sendMessage(@RequestParam final String message) {
    sender.send(message);
    return "Message sent!";
  }
}
