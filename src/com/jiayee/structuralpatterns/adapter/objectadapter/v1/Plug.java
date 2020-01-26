package com.jiayee.structuralpatterns.adapter.objectadapter.v1;

/**
 * An interface to narrow down the adaptee class. This is so we can do the minimum needed for
 * smooth adaptation.
 */
public interface Plug {
  void plugInto(final Socket socket);
}
