package com.codesree.common;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="helloWorld", eager=true)
public class HelloWorld implements Serializable {

  public HelloWorld() {
    System.out.println("Inside constructor.");
  }
  
  public String getMessage() {
    return "Hello Sreerag.";
  }
}