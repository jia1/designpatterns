package com.jiayee.creationalpatterns.factorymethod.v2;

public class RealFactoryProduct implements FactoryProduct {
  @Override
  public void greet() {
    System.out.println("RealFactoryProduct.");
  }
}
