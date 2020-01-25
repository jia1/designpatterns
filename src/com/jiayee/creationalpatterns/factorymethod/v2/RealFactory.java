package com.jiayee.creationalpatterns.factorymethod.v2;

public class RealFactory implements Factory {
  @Override
  public FactoryProduct factoryMethod() {
    return new RealFactoryProduct();
  }
}
