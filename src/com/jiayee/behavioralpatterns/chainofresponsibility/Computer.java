package com.jiayee.behavioralpatterns.chainofresponsibility;

public class Computer {
  private final PrinterDriver printerDriver;

  public Computer(final Printer printer) {
    this.printerDriver = new PrinterDriver(printer);
  }

  public void print() {
    printerDriver.print();
  }
}
