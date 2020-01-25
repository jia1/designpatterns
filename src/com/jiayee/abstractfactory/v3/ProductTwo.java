package com.jiayee.abstractfactory.v3;

public class ProductTwo implements SomeProduct {
  @Override
  public SomeProduct clone() {
    return new ProductTwo();
  }

  @Override
  public void greet() {
    System.out.println("ProductTwo.");
  }
}
