package com.jiayee.structuralpatterns.facade.v2;

import java.util.List;

public interface Gardener {
  List<String> getPlants();

  default void fertilise(final String plant) {
    System.out.println(String.format("Gardener fertilised %s.", plant));
  }

  default void trim(final String plant) {
    System.out.println(String.format("Gardener trimmed %s.", plant));
  }

  default void water(final String plant) {
    System.out.println(String.format("Gardener watered %s.", plant));
  }
}
