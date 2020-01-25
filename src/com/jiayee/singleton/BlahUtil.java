package com.jiayee.singleton;

/**
 * Benefits of using a singleton: Controlled access to instance, reduce namespace pollution by
 * replacing global variables with getInstance method, allows subclassing (see BlahBlahUtil), can be
 * n-ton instead of singleton by modifying getInstance method, more flexible than static methods
 * since static methods cannot be overridden.
 */
public class BlahUtil implements Singleton {
  // May need to be cautious over this way of implementing singleton, especially for C++. This is
  // because: 1. We cannot be sure if this is really instantiated only once, or can we? 2. What if
  // we need run-time args to instantiate a parameterised BlahUtil? 3. Run order / dependencies
  // between constructor(s) and static fields, if any.
  private static BlahUtil util;

  // Declare but do not initialise util. Then check isInstantiated flag in constructor and / or
  // getInstance. If false, instantiate BlahUtil and store it in util. If true, then return util.
  private static boolean isInstantiated = false;

  // Should be private unless subclassing it
  BlahUtil() {
    if (!isInstantiated) {
      util = this;
      isInstantiated = true;
    }
    SingletonRegistry.register(util);
  }

  public static BlahUtil getInstance() {
    return (isInstantiated) ? util : new BlahUtil();
  }

  public void doStuff() {
    System.out.println("BlahUtil.");
  }
}
