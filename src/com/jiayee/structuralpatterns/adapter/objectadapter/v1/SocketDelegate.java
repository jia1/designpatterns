package com.jiayee.structuralpatterns.adapter.objectadapter.v1;

public class SocketDelegate implements Socket {
  @Override
  public void switchOn() {
    System.out.println("SocketDelegate is switched on.");
  }
}
