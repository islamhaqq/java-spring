package com.syedaman.hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {
  private Greeter greeter = new Greeter();

  @Test
  public void greeterSaysHello() {
    assertThat(greeter.sayHello(), containsString("Hello"));
  }

  @Test
  public void greeterSaysWorld() {
    assertThat(greeter.sayHello(), containsString("world!"));
  }
}
