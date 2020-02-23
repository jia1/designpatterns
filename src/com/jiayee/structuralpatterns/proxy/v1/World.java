package com.jiayee.structuralpatterns.proxy.v1;

public interface World {
  int getNumRows();

  int getNumCols();

  void draw(final int row, final int col);
}
