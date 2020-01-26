package com.jiayee.structuralpatterns.adapter.objectadapter.v1;

public class UniversalAdapter implements Socket {
  private Plug plug;

  public UniversalAdapter(final Plug plug) {
    this.plug = plug;
  }

  @Override
  public void switchOn() {
    plug.plugInto(this);
    System.out.println("Switched on.");
  }
}
