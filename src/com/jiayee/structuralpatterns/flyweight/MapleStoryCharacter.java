package com.jiayee.structuralpatterns.flyweight;

public class MapleStoryCharacter {
  private Hairstyle hairstyle;

  public MapleStoryCharacter(final Hairstyle hairstyle) {
    this.hairstyle = hairstyle;
  }

  public Hairstyle getHairstyle() {
    return hairstyle;
  }
}
