package com.jiayee.creationalpatterns.abstractfactory.v3;

public interface SomeProduct {
  SomeProduct clone();

  default void greet() {
    System.out.println("SomeProduct.");
  }
}
