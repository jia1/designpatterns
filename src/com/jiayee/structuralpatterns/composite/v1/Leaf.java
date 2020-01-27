package com.jiayee.structuralpatterns.composite.v1;

import java.util.ArrayList;
import java.util.List;

public class Leaf implements Node {
  private Node parent;

  @Override
  public Node getParent() {
    return parent;
  }

  @Override
  public void setParent(final Node parent) {
    this.parent = parent;
  }

  @Override
  public List<Node> getChildren() {
    return new ArrayList<>();
  }

  @Override
  public void addChildren(final Node... children) {
    throw new UnsupportedOperationException("Leaf node cannot have children.");
  }

  @Override
  public void setChildren(final List<Node> children) {
    throw new UnsupportedOperationException("Leaf node cannot have children.");
  }

  @Override
  public void print() {
    System.out.println("Leaf.");
  }
}
