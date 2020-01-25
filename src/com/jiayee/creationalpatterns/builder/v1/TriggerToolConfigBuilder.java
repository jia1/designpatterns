package com.jiayee.creationalpatterns.builder.v1;

import java.time.LocalDate;
import java.util.Optional;
import javax.sql.DataSource;

/**
 * Builder for TriggerToolConfig. Implementation issues to consider: 1. Assembly and construction interface. 2. Abstract class
 * or interface? 3. Empty methods as default in builder.
 *
 * Like abstract factory, the builder introduces code complexities in exchange for flexibility via step-by-step construction.
 * Abstract factory focuses on abstracting the factories for a family of product classes.
 * @author jylim
 */

public class TriggerToolConfigBuilder {
    private String country;

    private LocalDate runDate = LocalDate.now();

    private int recordLimit = Integer.MAX_VALUE;

    private DataSource dataSource;

    public TriggerToolConfigBuilder country(final String country) {
        this.country = country;
        return this;
    }

    public TriggerToolConfigBuilder runDate(final LocalDate runDate) {
        this.runDate = runDate;
        return this;
    }

    public TriggerToolConfigBuilder recordLimit(final int recordLimit) {
        this.recordLimit = recordLimit;
        return this;
    }

    public TriggerToolConfigBuilder dataSource(final DataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public TriggerToolConfig build() {
        return new TriggerToolConfig(this);
    }

    String getCountry() {
        return country;
    }

    LocalDate getRunDate() {
        return runDate;
    }

    int getRecordLimit() {
        return recordLimit;
    }

    Optional<DataSource> getDataSource() {
        return Optional.ofNullable(dataSource);
    }
}
