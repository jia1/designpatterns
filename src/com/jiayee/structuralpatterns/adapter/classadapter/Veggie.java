package com.jiayee.structuralpatterns.adapter.classadapter;

public interface Veggie {
  default void nom() {
    System.out.println("Yum veggie.");
  }
}
