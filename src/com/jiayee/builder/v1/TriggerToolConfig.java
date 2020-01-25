package com.jiayee.builder.v1;

import java.time.LocalDate;
import java.util.Optional;
import javax.sql.DataSource;

/**
 * @author jylim
 */

public class TriggerToolConfig {
    private final String country;

    private final LocalDate runDate;

    private DataSource dataSource;

    private final int recordLimit;

    TriggerToolConfig(final TriggerToolConfigBuilder builder) {
        country = builder.getCountry();
        runDate = builder.getRunDate();
        recordLimit = builder.getRecordLimit();
        if (builder.getDataSource().isPresent()) {
            dataSource = builder.getDataSource().get();
        }
    }

    public String getCountry() {
        return country;
    }

    public LocalDate getRunDate() {
        return runDate;
    }

    public int getRecordLimit() {
        return recordLimit;
    }

    public Optional<DataSource> getDataSource() {
        return Optional.ofNullable(dataSource);
    }
}
