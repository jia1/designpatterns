package com.jiayee.structuralpatterns.composite.v1;

import java.util.List;

/**
 * Not exactly a composite pattern here since Node is both the component and the "composite".
 * <p>
 * The composite pattern consists of the component interface, the "thing" which we want to form a
 * part-whole hierarchy of, and the composite, something which can be composed by one or more
 * components.
 * <p>
 * Implementation details to consider:
 *    1. Should there be explicit parent references?
 *    2. Sharing of components (reusing the same reference). But this means a child node should be
 *    allowed to have multiple parents, so that it can be reused in any / every part of the
 *    traversal. However, this causes ambiguity when bubbling up.
 *    3. Maximising versus optimising the component interface. Not all of the methods in one
 *    interface are likely to be useful to every subclass (otherwise, these subclasses are more or
 *    less the same). However, making the component interface leaner would mean that
 *    subclass-specific operations are not accessible during traversal in the composite pattern.
 *    4. Implement add or remove children at the component interface or the subclass? The former
 *    leads to transparent and uniform treatment of component subclasses. The latter leads to safe
 *    treatment of component subclasses at the cost of transparency and lack of uniformity. It is
 *    "safe" because we can prevent illegal methods from being called e.g. calling addChildNode to a
 *    Leaf node. The former is recommended so that we do not lose type info and will not need to do
 *    type-casting (e.g. casting Node to Leaf). One way to circumvent this is to specify a
 *    "boolean isLeaf()" method.
 *    5. Refer to book.
 *    6. Child ordering.
 *    7. Caching.
 *    8. Garbage collection of orphaned components.
 *    9. Most suitable data structure to store components / children e.g. linked list, hash map,
 *    etc.
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
