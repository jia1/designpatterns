package com.jiayee.structuralpatterns.proxy.v1;

public class SpyroWorld implements World {
  private final SpyroWorldProxy spyroWorldProxy;

  SpyroWorld(final SpyroWorldProxy spyroWorldProxy) {
    this.spyroWorldProxy = spyroWorldProxy;
  }

  @Override
  public int getNumRows() {
    return spyroWorldProxy.getNumRows();
  }

  @Override
  public int getNumCols() {
    return spyroWorldProxy.getNumCols();
  }

  @Override
  public void draw(int row, int col) {
    System.out.println(String.format("SpyroWorld drawn for row %d, col %d.", row, col));
  }
}
