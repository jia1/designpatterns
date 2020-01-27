package com.jiayee.structuralpatterns.composite.v1;

import java.util.List;

/**
 * Not exactly a composite pattern here since Node is both the component and the "composite".
 */
public interface Node {
  Node getParent();

  void setParent(final Node parent);

  List<Node> getChildren();

  void addChildren(final Node... children);

  void setChildren(final List<Node> children);

  default void print() {
    System.out.println("Node.");
  }
}
