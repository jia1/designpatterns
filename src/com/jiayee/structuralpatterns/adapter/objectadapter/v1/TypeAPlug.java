package com.jiayee.structuralpatterns.adapter.objectadapter.v1;

/**
 * USA is one country which uses this 2-pin plug with no ground.
 */
public class TypeAPlug implements Plug {
  @Override
  public void plugInto(Socket socket) {
    System.out.println("Type A plug connected!");
  }
}
