package com.jiayee.creationalpatterns.factorymethod.v1;

public class Bit implements Pet {
  @Override
  public void makeSound() {
    System.out.println("Bit!");
  }
}
