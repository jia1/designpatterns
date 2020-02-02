package com.jiayee.structuralpatterns.facade.v1;

class Yum {
  static void install(final String packageName) {
    Network.downloadRepository(packageName);
  }
}
