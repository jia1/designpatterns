package com.jiayee.creationalpatterns.singleton.v1;

public class BlahBlahUtil extends BlahUtil {
  private static BlahBlahUtil util;

  private static boolean isInstantiated = false;

  private BlahBlahUtil() {
    if (!isInstantiated) {
      util = this;
      isInstantiated = true;
    }
    SingletonRegistry.register(util);
  }

  public static BlahBlahUtil getInstance() {
    return (isInstantiated) ? util : new BlahBlahUtil();
  }

  @Override
  public void doStuff() {
    System.out.println("BlahBlahUtil.");
  }
}
