package com.jiayee.structuralpatterns.bridge.v1;

/**
 * Things to consider when applying the bridge pattern: What the implementor should have.
 * <p>
 * Useful side-effect of the bridge pattern: Implementors can be shared across various abstractions.
 * <p>
 * The abstract factory can help in creating bridges.
 */
public interface BarChartImplementor {
  String drawBars(final ChartDataset dataset);
}
