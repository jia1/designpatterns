package com.jiayee.structuralpatterns.adapter.classadapter;

public interface Fruit {
  default void eat() {
    System.out.println("Yum fruit.");
  }
}
