package com.jiayee.structuralpatterns.adapter.objectadapter.v1;

public class UniversalAdapterTwo implements Socket {
  private final Socket socket;

  private final Plug plug;

  public UniversalAdapterTwo(final Socket socket, final Plug plug) {
    this.socket = socket;
    this.plug = plug;
  }

  @Override
  public void switchOn() {
    plug.plugInto(this);
    socket.switchOn();
  }
}
