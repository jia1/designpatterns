package com.jiayee.structuralpatterns.bridge.v1;

public class JFreeBarChartImplementor implements BarChartImplementor {
  @Override
  public String drawBars(ChartDataset dataset) {
    return "This is a JFreeBarChart.";
  }
}
