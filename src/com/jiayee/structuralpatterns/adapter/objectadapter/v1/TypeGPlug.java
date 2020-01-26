package com.jiayee.structuralpatterns.adapter.objectadapter.v1;

/**
 * European countries are examples of countries which use this 2-pin plug with no ground.
 */
public class TypeGPlug implements Plug {
  @Override
  public void plugInto(Socket socket) {
    System.out.println("Type G plug connected!");
  }
}
