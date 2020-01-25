package com.jiayee.creationalpatterns.abstractfactory.v2;

public class TheIceCreamFactory implements TheFactory {
  @Override
  public void makeSomething() {
    System.out.println("IceCream!");
  }
}
