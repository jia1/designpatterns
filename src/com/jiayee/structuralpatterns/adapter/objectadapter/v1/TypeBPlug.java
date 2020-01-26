package com.jiayee.structuralpatterns.adapter.objectadapter.v1;

/**
 * USA is one country which uses this 2-pin plug with ground.
 */
public class TypeBPlug implements Plug {
  @Override
  public void plugInto(Socket socket) {
    System.out.println("Type B plug connected!");
  }
}
