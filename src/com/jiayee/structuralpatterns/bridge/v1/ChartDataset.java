package com.jiayee.structuralpatterns.bridge.v1;

import java.util.List;

public class ChartDataset {
  final List<ChartDataPoint> dataPoints;

  public ChartDataset(final List<ChartDataPoint> dataPoints) {
    this.dataPoints = dataPoints;
  }

  public static class ChartDataPoint {
    final String label;

    final String value;

    public ChartDataPoint(final String label, final String value) {
      this.label = label;
      this.value = value;
    }

    public String getLabel() {
      return label;
    }

    public String getValue() {
      return value;
    }
  }
}
