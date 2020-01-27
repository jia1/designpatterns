package com.jiayee.structuralpatterns.composite.v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Root implements Node {
  private List<Node> children = new ArrayList<>();

  @Override
  public Node getParent() {
    return null;
  }

  @Override
  public void setParent(final Node parent) {
    throw new UnsupportedOperationException("Root node cannot have parent.");
  }

  @Override
  public List<Node> getChildren() {
    return children;
  }

  @Override
  public void addChildren(final Node... children) {
    this.children.addAll(Arrays.asList(children));
  }

  @Override
  public void setChildren(final List<Node> children) {
    this.children = children;
  }

  @Override
  public void print() {
    System.out.println("Root.");
  }
}
