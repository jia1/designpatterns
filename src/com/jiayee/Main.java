package com.jiayee;

import com.jiayee.abstractfactory.Cat;
import com.jiayee.abstractfactory.CatShelterFactory;
import com.jiayee.abstractfactory.CatShelterFactoryFactory;
import com.jiayee.abstractfactory.ShelterType;
import com.jiayee.builder.TriggerToolConfig;
import com.jiayee.builder.TriggerToolConfigBuilder;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Abstract factory
        System.out.println("#### Abstract factory");
        final CatShelterFactory cuteCatShelterFactory = CatShelterFactoryFactory.getCatShelterFactory(ShelterType.CUTE);
        final List<Cat> cuteCats = cuteCatShelterFactory.gatherCats();
        cuteCats.forEach(cat -> System.out.println(cat.makeSound()));

        final CatShelterFactory uglyCatShelterFactory = CatShelterFactoryFactory.getCatShelterFactory(ShelterType.UGLY);
        final List<Cat> uglyCats = uglyCatShelterFactory.gatherCats();
        uglyCats.forEach(cat -> System.out.println(cat.makeSound()));

        // Builder
        System.out.println("#### Builder");
        final TriggerToolConfig config = new TriggerToolConfigBuilder()
                .country("SG")
                .runDate(LocalDate.of(2020, Month.FEBRUARY, 10))
                .build();
        System.out.println(config.getCountry());
        System.out.println(config.getRunDate());
        System.out.println(config.getRecordLimit());
        System.out.println(config.getDataSource().isPresent());
    }
}
