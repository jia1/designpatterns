package com.jiayee.behavioralpatterns.interpreter.v1;

public abstract class BinaryOperation implements Expression {
  private final Expression e1;

  private final String op;

  private final Expression e2;

  BinaryOperation(Expression e1, String op, Expression e2) {
    this.e1 = e1;
    this.op = op;
    this.e2 = e2;
  }

  @Override
  public String evaluate() {
    return String.format("%s %s %s", e1.evaluate(), op.toUpperCase(), e2.evaluate());
  }
}
