package com.jiayee.structuralpatterns.flyweight;

import java.util.Random;

public class FemaleHairstyle2Flyweight implements Hairstyle {
  private int someRandomNumber;

  FemaleHairstyle2Flyweight() {
    someRandomNumber = new Random().nextInt();
  }

  @Override
  public void describe() {
    System.out.println(String.format("FemaleHairstyle2Flyweight: %d", someRandomNumber));
  }
}
