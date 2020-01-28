package com.jiayee.structuralpatterns.decorator;

public class RealRoomDecorator implements RoomDecorator {
  private final Room room;

  public RealRoomDecorator(final Room room) {
    this.room = room;
  }

  @Override
  public Room getRoom() {
    return room;
  }

  public boolean isDecorated() {
    return true;
  }
}
