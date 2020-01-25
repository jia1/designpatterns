package com.jiayee.structuralpatterns.adapter.classadapter;

/**
 * Fruit is the target and Veggie is the adaptee. We adapt Veggie to follow the interface of Fruit.
 * <p>
 * Note that this adapter commits to the concrete interface of Veggie. We cannot extend this adapter
 * to subclasses of Veggie.
 * <p>
 * Expect overriding.
 * <p>
 * No object composition -> no additional pointer to Veggie instance.
 */
public class HealthyFoodAdapter implements Fruit, Veggie {
  @Override
  public void eat() {
    Veggie.super.nom();
  }
}
