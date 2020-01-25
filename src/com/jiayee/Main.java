package com.jiayee;

import com.jiayee.abstractfactory.Cat;
import com.jiayee.abstractfactory.CatShelterFactory;
import com.jiayee.abstractfactory.CatShelterFactoryFactory;
import com.jiayee.abstractfactory.ShelterType;
import com.jiayee.builder.TriggerToolConfig;
import com.jiayee.builder.TriggerToolConfigBuilder;
import com.jiayee.factorymethod.HamsterCage;
import com.jiayee.prototype.PugHouse;
import com.jiayee.singleton.BlahBlahUtil;
import com.jiayee.singleton.BlahUtil;
import com.jiayee.singleton.Singleton;
import com.jiayee.singleton.SingletonRegistry;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

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

        // Factory method
        System.out.println("#### Factory method");
        final HamsterCage cage = new HamsterCage();
        cage.addPet();
        cage.getPet(0).makeSound();

        // Prototype
        System.out.println("#### Prototype");
        final PugHouse pugHouse = new PugHouse();
        pugHouse.addPug();
        pugHouse.addPug();
        pugHouse.hearPugs();

        // Singleton
        System.out.println("#### Singleton");
        // getInstance must be called or the register method will not be called. I did not register
        // the singletons automatically (i.e. by storing a list of predetermined singleton classes).
        final BlahUtil blahUtil = BlahUtil.getInstance();
        blahUtil.doStuff();
        final BlahBlahUtil blahBlahUtil = BlahBlahUtil.getInstance();
        blahBlahUtil.doStuff();
        // getInstance must be called before lookup!
        final Optional<Singleton> blahUtilOptional = SingletonRegistry.lookup(BlahUtil.class);
        blahUtilOptional.ifPresent(singleton -> ((BlahUtil) singleton).doStuff());
        final Optional<Singleton> blahBlahUtilOptional = SingletonRegistry
            .lookup(BlahBlahUtil.class);
        blahBlahUtilOptional.ifPresent(singleton -> ((BlahBlahUtil) singleton).doStuff());
    }
}
