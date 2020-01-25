package com.jiayee.structuralpatterns.adapter.classadapter;

public interface Cabbage extends Veggie {
  @Override
  default void nom() {
    System.out.println("Yum cabbage.");
  }
}
