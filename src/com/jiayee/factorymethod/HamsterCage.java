package com.jiayee.factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Further subclassing could be avoided if we make use of generic typing.
 */
public class HamsterCage implements PetCage {
  private final List<Pet> pets = new ArrayList<>();

  @Override
  public Pet createPet() {
    final Pet newBit = new Bit();
    newBit.makeSound();
    return newBit;
  }

  @Override
  public void addPet() {
    pets.add(createPet());
  }

  @Override
  public List<Pet> getPets() {
    return pets;
  }
}
