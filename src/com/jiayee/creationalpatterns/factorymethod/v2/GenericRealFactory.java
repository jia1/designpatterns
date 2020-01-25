package com.jiayee.creationalpatterns.factorymethod.v2;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * Another alternative would be to parameterize factoryMethod with FactoryProductType, and depending
 * on the value of this enum, the true subclass of FactoryProduct can vary.
 * @param <T> factory product type
 */
public class GenericRealFactory<T extends FactoryProduct> implements Factory {
  private final Supplier<? extends T> supplier;

  public GenericRealFactory(final Supplier<? extends T> supplier) {
    this.supplier = Objects.requireNonNull(supplier);
  }

  @Override
  public FactoryProduct factoryMethod() {
    return supplier.get();
  }
}
