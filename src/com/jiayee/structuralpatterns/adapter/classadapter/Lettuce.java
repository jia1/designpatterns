package com.jiayee.structuralpatterns.adapter.classadapter;

public interface Lettuce extends Veggie {
  @Override
  default void nom() {
    System.out.println("Yum lettuce.");
  }
}
