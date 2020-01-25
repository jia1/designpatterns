package com.jiayee.creationalpatterns.abstractfactory.v2;

/**
 * Components of the abstract factory design pattern: 1. An abstract factory which returns a factory
 * depending on runtime argument(s). 2. The factories to be parked under this abstract factory. 3. A
 * caller / user who queries the abstract factory to get a factory and runs the factory methods
 * (without knowing what is the concrete factory).
 * <p>
 * I find it extremely hard to swallow the Applicability section of this design pattern.
 */
public class TheAbstractFactory {
  public static TheFactory getFactory(final TheFactoryType type) {
    if (type == TheFactoryType.CHEESECAKE) {
      return new TheCheesecakeFactory(); // Should be singleton
    }
    return new TheIceCreamFactory(); // Should be singleton
  }
}
