package com.syedaman.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class GreetingController {

  // http://localhost:8080/say
  // { content: "I'm winnin'!" }
  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam(value="name", defaultValue="W.B. White") String name) {
    return new Greeting(name);
  }
}
