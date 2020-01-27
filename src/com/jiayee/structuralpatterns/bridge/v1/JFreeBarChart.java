package com.jiayee.structuralpatterns.bridge.v1;

import java.util.Optional;

public class JFreeBarChart implements BarChart {
  private BarChartImplementor implementor;

  private ChartDataset dataset;

  @Override
  public Optional<BarChartImplementor> getImplementor() {
    return Optional.ofNullable(implementor);
  }

  @Override
  public void setImplementor(BarChartImplementor implementor) {
    this.implementor = implementor;
  }

  @Override
  public Optional<ChartDataset> getDataset() {
    return Optional.ofNullable(dataset);
  }

  @Override
  public void setDataset(ChartDataset dataset) {
    this.dataset = dataset;
  }
}
