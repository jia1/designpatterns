package com.jiayee.behavioralpatterns.interpreter.v1;

public class Logic extends BinaryOperation {
  public Logic(final Expression e1, final String op, final Expression e2) {
    super(e1, op, e2);
  }
}
