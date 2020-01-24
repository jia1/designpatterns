package com.jiayee.factorymethod;

import java.util.List;

public interface PetCage {
  Pet createPet();

  void addPet();

  List<Pet> getPets();

  default Pet getPet(final int index) {
    return getPets().get(index);
  }
}
