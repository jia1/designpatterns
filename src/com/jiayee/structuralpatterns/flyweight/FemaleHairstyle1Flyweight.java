package com.jiayee.structuralpatterns.flyweight;

import java.util.Random;

public class FemaleHairstyle1Flyweight implements Hairstyle {
  private int someRandomNumber;

  FemaleHairstyle1Flyweight() {
    someRandomNumber = new Random().nextInt();
  }

  @Override
  public void describe() {
    System.out.println(String.format("FemaleHairstyle1Flyweight: %d", someRandomNumber));
  }
}
