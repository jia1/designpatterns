package com.jiayee.structuralpatterns.decorator;

public interface Room {
  default boolean hasDoor() {
    return true;
  }

  default boolean hasWindow() {
    return true;
  }
}
