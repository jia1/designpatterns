package com.jiayee.structuralpatterns.adapter.objectadapter.v1;

/**
 * This adapter implements abstract operations.
 * <p>
 * Unexplored: Parameterised adapter.
 */
public class UniversalAdapter implements Socket {
  private final Plug plug;

  public UniversalAdapter(final Plug plug) {
    this.plug = plug;
  }

  @Override
  public void switchOn() {
    plug.plugInto(this);
    System.out.println("Socket is switched on.");
  }
}
