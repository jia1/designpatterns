package com.jiayee.behavioralpatterns.command;

import java.util.Stack;

public class MicrosoftPaint {
  private final Stack<Command<String>> doneCommands = new Stack<>();

  private final Stack<Command<String>> undoneCommands = new Stack<>();

  private int counter = 0;

  public void draw() {
    final Command<String> drawCommand = new Command<String>() {
      private final int counter = MicrosoftPaint.this.counter++;

      @Override
      public String execute() {
        return String.valueOf(counter);
      }

      @Override
      public void undo() {
        System.out.println(counter);
      }
    };
    System.out.println(drawCommand.execute());
    doneCommands.push(drawCommand);
  }

  public void undo() {
    if (doneCommands.isEmpty()) {
      return;
    }
    final Command<String> poppedDrawCommand = doneCommands.pop();
    poppedDrawCommand.undo();
    undoneCommands.push(poppedDrawCommand);
  }

  public void redo() {
    if (undoneCommands.isEmpty()) {
      return;
    }
    final Command<String> poppedDrawCommand = undoneCommands.pop();
    poppedDrawCommand.undo();
    doneCommands.push(poppedDrawCommand);
  }
}
