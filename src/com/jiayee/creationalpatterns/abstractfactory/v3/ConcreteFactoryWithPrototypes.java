package com.jiayee.creationalpatterns.abstractfactory.v3;

import static java.util.stream.Collectors.toMap;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

class ConcreteFactoryWithPrototypes {
  private static Map<Class, SomeProduct> products = Stream.of(new Object[][] {
      {ProductOne.class, new ProductOne()},
      {ProductTwo.class, new ProductTwo()}
  }).collect(toMap(
      data -> (Class) data[0],
      data -> (SomeProduct) data[1]
  ));

  static Optional<SomeProduct> make(final Class clazz) {
    if (!products.containsKey(clazz)) {
      return Optional.empty();
    }
    return Optional.of(products.get(clazz).clone());
  }
}
