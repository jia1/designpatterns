package com.jiayee.creationalpatterns.abstractfactory.v2;

/**
 * Note that for every slight variation of product, we need to create a new TheFactory subclass. One
 * way to avoid this spam is to implement such concrete factories with Prototype.
 */
public class TheCheesecakeFactory implements TheFactory {
  @Override
  public void makeSomething() {
    System.out.println("Cheesecake!");
  }
}
