package com.jiayee.prototype.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * Create object based on an existing object through cloning. Applicability: When cloning is cheaper
 * than creating, when it is less of a hassle to clone based on a pre-determined set of states than
 * manual instantiation over and over again, when it is desirable to avoid a class hierarchy of
 * factories and when the class to instantiate are specified at run-time.
 * <p>
 * The run-time benefit can be acquired when the list of available prototypes are stored elsewhere
 * i.e. a registry. This registry is also known as a prototype manager.
 * <p>
 * TODO: Set up a prototype manager / registry!
 */
public class PugHouse {
  // This prototype should be in a registry of prototypes which the PugHouse can then query for.
  private final Pug pugPrototype = new Pug();

  private List<Pug> pugs = new ArrayList<>();

  public void addPug() {
    pugs.add(pugPrototype.clone());
  }

  public void hearPugs() {
    pugs.forEach(Pug::woof);
  }
}
