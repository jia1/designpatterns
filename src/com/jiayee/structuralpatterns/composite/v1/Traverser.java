package com.jiayee.structuralpatterns.composite.v1;

import java.util.ArrayDeque;
import java.util.Queue;

public final class Traverser {
  private Traverser() {
  }

  public static void traverse(final Node root) {
    Queue<Node> q = new ArrayDeque<>();
    q.add(root);
    while (!q.isEmpty()) {
      final Node currentNode = q.remove();
      currentNode.print();
      q.addAll(currentNode.getChildren());
    }
  }
}
