package com.jiayee.factorymethod.v1;

public class Bit implements Pet {
  @Override
  public void makeSound() {
    System.out.println("Bit!");
  }
}
