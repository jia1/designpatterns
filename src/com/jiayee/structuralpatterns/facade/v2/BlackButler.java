package com.jiayee.structuralpatterns.facade.v2;

import java.util.List;

/**
 * Copied from https://java-design-patterns.com/patterns/facade:
 * Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level
 * interface that makes the subsystem easier to use.
 */
public interface BlackButler {
  Chef getChef();

  Gardener getGardener();

  Maid getMaid();

  default void cookForTheLord(final String meal) {
    getChef().buyIngredients(meal);
    getChef().cook(meal);
  }

  default void beautifyEstate() {
    final List<String> plants = getGardener().getPlants();
    plants.forEach(plant -> {
      getGardener().trim(plant);
      getGardener().water(plant);
      getGardener().fertilise(plant);
      getGardener().water(plant);
    });
  }

  default void cleanEstate() {
    final List<String> rooms = getMaid().getRooms();
    rooms.forEach(room -> getMaid().sweep(room));
  }
}
