package com.jiayee.structuralpatterns.flyweight;

public interface Hairstyle {
  default void describe() {
    System.out.println("Hairstyle");
  }
}
