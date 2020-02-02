package com.jiayee.structuralpatterns.facade.v2;

public interface Chef {
  default void buyIngredients(final String meal) {
    System.out.println(String.format("Chef bought ingredients for %s.", meal));
  }

  default void cook(final String meal) {
    System.out.println(String.format("Chef cooked %s.", meal));
  }
}
