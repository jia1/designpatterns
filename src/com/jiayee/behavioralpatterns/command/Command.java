package com.jiayee.behavioralpatterns.command;

public interface Command<T> {
  T execute();

  void undo();
}
