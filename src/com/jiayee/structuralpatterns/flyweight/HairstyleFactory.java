package com.jiayee.structuralpatterns.flyweight;

// TODO: HairstyleFactory should be singleton. The code below can be refactored to do DRY.
public class HairstyleFactory {
  private FemaleHairstyle1Flyweight femaleHairstyle1Flyweight;

  private FemaleHairstyle2Flyweight femaleHairstyle2Flyweight;

  public FemaleHairstyle1Flyweight getFemaleHairstyle1Flyweight() {
    if (femaleHairstyle1Flyweight == null) {
      femaleHairstyle1Flyweight = new FemaleHairstyle1Flyweight();
    }
    return femaleHairstyle1Flyweight;
  }

  public FemaleHairstyle2Flyweight getFemaleHairstyle2Flyweight() {
    if (femaleHairstyle2Flyweight == null) {
      femaleHairstyle2Flyweight = new FemaleHairstyle2Flyweight();
    }
    return femaleHairstyle2Flyweight;
  }
}
