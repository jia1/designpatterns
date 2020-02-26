package com.jiayee.behavioralpatterns.interpreter.v1;

public abstract class UnaryOperation implements Expression {
  private final String value;

  UnaryOperation(String value) {
    this.value = value;
  }

  @Override
  public String evaluate() {
    return value;
  }
}
