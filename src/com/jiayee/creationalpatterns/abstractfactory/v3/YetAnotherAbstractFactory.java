package com.jiayee.creationalpatterns.abstractfactory.v3;

import java.util.Optional;

public class YetAnotherAbstractFactory {
  public static Optional<SomeProduct> getProduct(final Class clazz) {
    return ConcreteFactoryWithPrototypes.make(clazz);
  }
}
