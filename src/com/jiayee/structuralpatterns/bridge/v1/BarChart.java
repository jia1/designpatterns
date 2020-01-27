package com.jiayee.structuralpatterns.bridge.v1;

import java.util.Optional;

/**
 * Imagine that the drawn bars are represented by a string and all BarChart-related classes
 * understand this representation, somehow.
 * <p>
 * Another (similar) way to look at bridges is object composition. The bar chart abstraction
 * contains the bar chart implementation. To change implementations (e.g. when we want to use
 * another bar chart framework, or when we cannot use the default implementation due to OS
 * limitations), we simply compose with a different but suitable implementor.
 */
public interface BarChart {
  Optional<BarChartImplementor> getImplementor();

  void setImplementor(final BarChartImplementor implementor);

  Optional<ChartDataset> getDataset();

  void setDataset(final ChartDataset dataset);

  default String drawBars() {
    final Optional<BarChartImplementor> implementorOptional = getImplementor();
    if (!implementorOptional.isPresent()) {
      System.out.println("No implementor.");
      return "";
    }
    final Optional<ChartDataset> datasetOptional = getDataset();
    if (!datasetOptional.isPresent()) {
      System.out.println("No dataset.");
      return "";
    }
    final BarChartImplementor implementor = implementorOptional.get();
    final ChartDataset dataset = datasetOptional.get();
    System.out.println("Drawing...");
    return implementor.drawBars(dataset);
  }
}
