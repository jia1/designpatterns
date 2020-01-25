package com.jiayee.prototype.v1;

public class Pug implements Dog {
  // This is expected to be a difficult method to implement, especially when the class / object is
  // more complex (e.g. circular references). Furthermore, we need to decide if we want a shallow
  // copy or a deep copy.
  // Note that this clone method comes from Cloneable and we cannot pass parameters into it. This
  // means that the Pug created is standard across all clones. To adjust state at time of cloning,
  // we may need to build our own clone function signature(s).
  @Override
  public Pug clone() {
    return new Pug();
  }

  @Override
  public void woof() {
    System.out.println("Yawn.");
  }
}
