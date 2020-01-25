package com.jiayee.creationalpatterns.abstractfactory.v3;

public class ProductOne implements SomeProduct {
  @Override
  public SomeProduct clone() {
    return new ProductOne();
  }

  @Override
  public void greet() {
    System.out.println("ProductOne.");
  }
}
