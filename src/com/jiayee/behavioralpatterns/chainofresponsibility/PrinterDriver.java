package com.jiayee.behavioralpatterns.chainofresponsibility;

class PrinterDriver {
  private final Printer printer;

  PrinterDriver(final Printer printer) {
    this.printer = printer;
  }

  void print() {
    printer.print();
  }
}
