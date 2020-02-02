package com.jiayee.structuralpatterns.facade.v1;

public class Computer {
  void install(final String softwareName) {
    Linux.yumInstall(softwareName);
  }
}
