package com.jiayee.creationalpatterns.abstractfactory.v2;

public class TheFactoryUser {
  public void makeSomethingFromFactory(final TheFactory factory) {
    factory.makeSomething();
  }
}
