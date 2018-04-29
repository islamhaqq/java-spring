package com.syedaman.hello;

public class Greeter {
  public String sayHello() {
    return "Hello world!";
  }

  public String introduce(String name, int age) {
    return String.format("My name is %s and I am %d years old.", name, age);
  }
}
