package com.jiayee.structuralpatterns.facade.v2;

import java.util.List;

public interface Maid {
  List<String> getRooms();

  default void sweep(final String room) {
    System.out.println(String.format("Maid swept the %s.", room));
  }
}
