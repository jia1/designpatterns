package com.jiayee;

import com.jiayee.creationalpatterns.abstractfactory.v1.Cat;
import com.jiayee.creationalpatterns.abstractfactory.v1.CatShelterFactory;
import com.jiayee.creationalpatterns.abstractfactory.v1.CatShelterFactoryFactory;
import com.jiayee.creationalpatterns.abstractfactory.v1.ShelterType;
import com.jiayee.creationalpatterns.abstractfactory.v2.TheAbstractFactory;
import com.jiayee.creationalpatterns.abstractfactory.v2.TheFactoryType;
import com.jiayee.creationalpatterns.abstractfactory.v2.TheFactoryUser;
import com.jiayee.creationalpatterns.abstractfactory.v3.ProductOne;
import com.jiayee.creationalpatterns.abstractfactory.v3.ProductTwo;
import com.jiayee.creationalpatterns.abstractfactory.v3.SomeProduct;
import com.jiayee.creationalpatterns.abstractfactory.v3.YetAnotherAbstractFactory;
import com.jiayee.creationalpatterns.builder.v1.TriggerToolConfig;
import com.jiayee.creationalpatterns.builder.v1.TriggerToolConfigBuilder;
import com.jiayee.creationalpatterns.factorymethod.v1.HamsterCage;
import com.jiayee.creationalpatterns.factorymethod.v2.Factory;
import com.jiayee.creationalpatterns.factorymethod.v2.FactoryProduct;
import com.jiayee.creationalpatterns.factorymethod.v2.GenericRealFactory;
import com.jiayee.creationalpatterns.factorymethod.v2.RealFactory;
import com.jiayee.creationalpatterns.factorymethod.v2.RealFactoryProduct;
import com.jiayee.creationalpatterns.prototype.v1.PugHouse;
import com.jiayee.creationalpatterns.singleton.v1.BlahBlahUtil;
import com.jiayee.creationalpatterns.singleton.v1.BlahUtil;
import com.jiayee.creationalpatterns.singleton.v1.Singleton;
import com.jiayee.creationalpatterns.singleton.v1.SingletonRegistry;
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

        final TheFactoryUser user = new TheFactoryUser();
        user.makeSomethingFromFactory(TheAbstractFactory.getFactory(TheFactoryType.CHEESECAKE));
        user.makeSomethingFromFactory(TheAbstractFactory.getFactory(TheFactoryType.ICE_CREAM));

        final Optional<SomeProduct> productOneOptional = YetAnotherAbstractFactory
            .getProduct(ProductOne.class);
        productOneOptional.ifPresent(SomeProduct::greet); // Should print "ProductOne."
        final Optional<SomeProduct> productTwoOptional = YetAnotherAbstractFactory
            .getProduct(ProductTwo.class);
        productTwoOptional.ifPresent(SomeProduct::greet); // Should print "ProductTwo."

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

        final Factory factory = new RealFactory();
        factory.factoryMethod().greet();

        final GenericRealFactory<FactoryProduct> genericRealFactory = new GenericRealFactory<>(
            RealFactoryProduct::new);
        genericRealFactory.factoryMethod().greet();

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
