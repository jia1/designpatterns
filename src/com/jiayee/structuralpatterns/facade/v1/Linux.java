package com.jiayee.structuralpatterns.facade.v1;

class Linux {
  static void gitClone(final String repositoryName) {
    Network.downloadRepository(repositoryName);
  }

  static void yumInstall(final String packageName) {
    Yum.install(packageName);
  }
}
