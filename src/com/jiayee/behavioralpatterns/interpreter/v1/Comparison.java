package com.jiayee.behavioralpatterns.interpreter.v1;

public class Comparison extends BinaryOperation {
  public Comparison(final Expression e1, final String op, final Expression e2) {
    super(e1, op, e2);
  }
}
