package com.jiayee;

import com.jiayee.behavioralpatterns.chainofresponsibility.Computer;
import com.jiayee.behavioralpatterns.chainofresponsibility.Printer;
import com.jiayee.behavioralpatterns.command.MicrosoftPaint;
import com.jiayee.behavioralpatterns.interpreter.v1.Comparison;
import com.jiayee.behavioralpatterns.interpreter.v1.Literal;
import com.jiayee.behavioralpatterns.interpreter.v1.Logic;
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
import com.jiayee.structuralpatterns.adapter.classadapter.HealthyFoodAdapter;
import com.jiayee.structuralpatterns.adapter.objectadapter.v1.SocketDelegate;
import com.jiayee.structuralpatterns.adapter.objectadapter.v1.TypeAPlug;
import com.jiayee.structuralpatterns.adapter.objectadapter.v1.TypeGPlug;
import com.jiayee.structuralpatterns.adapter.objectadapter.v1.UniversalAdapter;
import com.jiayee.structuralpatterns.adapter.objectadapter.v1.UniversalAdapterTwo;
import com.jiayee.structuralpatterns.bridge.v1.ChartDataset;
import com.jiayee.structuralpatterns.bridge.v1.JFreeBarChart;
import com.jiayee.structuralpatterns.bridge.v1.JFreeBarChartImplementor;
import com.jiayee.structuralpatterns.composite.v1.InternalNode;
import com.jiayee.structuralpatterns.composite.v1.Leaf;
import com.jiayee.structuralpatterns.composite.v1.Node;
import com.jiayee.structuralpatterns.composite.v1.Root;
import com.jiayee.structuralpatterns.composite.v1.Traverser;
import com.jiayee.structuralpatterns.decorator.RealRoom;
import com.jiayee.structuralpatterns.decorator.RealRoomDecorator;
import com.jiayee.structuralpatterns.decorator.Room;
import com.jiayee.structuralpatterns.flyweight.HairstyleFactory;
import com.jiayee.structuralpatterns.flyweight.MapleStoryCharacter;
import com.jiayee.structuralpatterns.proxy.v1.SpyroWorldProxy;
import com.jiayee.structuralpatterns.proxy.v1.World;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
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

        // Adapter: Class adapter via multiple inheritance of interfaces
        System.out.println("#### Adapter");
        final HealthyFoodAdapter adapter = new HealthyFoodAdapter();
        adapter.eat();

        // Adapter: Object adapter via object composition of adaptee into adapter, a subclass of the
        // target
        final UniversalAdapter universalAdapter = new UniversalAdapter(new TypeAPlug());
        universalAdapter.switchOn();
        final UniversalAdapterTwo universalAdapter2 = new UniversalAdapterTwo(new SocketDelegate(),
            new TypeGPlug());
        universalAdapter2.switchOn();

        // Bridge
        System.out.println("#### Bridge");
        final JFreeBarChartImplementor chartImplementor = new JFreeBarChartImplementor();
        final ChartDataset dataset = new ChartDataset(new ArrayList<>());
        final JFreeBarChart chart = new JFreeBarChart();
        chart.setImplementor(chartImplementor);
        chart.setDataset(dataset);
        final String bars = chart.drawBars();
        System.out.println(bars);

        // Composite
        System.out.println("#### Composite");
        final Node leaf = new Leaf();
        final Node internalNode = new InternalNode();
        final Node root = new Root();
        leaf.setParent(internalNode);
        internalNode.addChildren(leaf);
        internalNode.setParent(root);
        root.addChildren(internalNode);
        Traverser.traverse(root);

        // Decorator
        System.out.println("#### Decorator");
        final Room room = new RealRoom();
        final RealRoomDecorator decoratedRoom = new RealRoomDecorator(room); // Note the type
        System.out.println(decoratedRoom.isDecorated());

        // Facade
        System.out.println("#### Facade");
        // See facade.v2 package

        // Flyweight
        System.out.println("#### Flyweight");
        final HairstyleFactory hairstyleFactory = new HairstyleFactory();
        final MapleStoryCharacter mapleStoryCharacter1 = new MapleStoryCharacter(hairstyleFactory
            .getFemaleHairstyle1Flyweight());
        final MapleStoryCharacter mapleStoryCharacter2 = new MapleStoryCharacter(hairstyleFactory
            .getFemaleHairstyle1Flyweight());
        final MapleStoryCharacter mapleStoryCharacter3 = new MapleStoryCharacter(hairstyleFactory
            .getFemaleHairstyle2Flyweight());
        final MapleStoryCharacter mapleStoryCharacter4 = new MapleStoryCharacter(hairstyleFactory
            .getFemaleHairstyle2Flyweight());
        mapleStoryCharacter1.getHairstyle().describe();
        mapleStoryCharacter2.getHairstyle().describe();
        System.out.println(mapleStoryCharacter1.getHairstyle()
            == mapleStoryCharacter2.getHairstyle());
        mapleStoryCharacter3.getHairstyle().describe();
        mapleStoryCharacter4.getHairstyle().describe();
        System.out.println(mapleStoryCharacter3.getHairstyle()
            == mapleStoryCharacter4.getHairstyle());

        // Proxy
        System.out.println("#### Proxy");
        final World spyroWorldProxy = new SpyroWorldProxy(10, 10);
        spyroWorldProxy.draw(1, 1);

        // Chain of responsibility
        System.out.println("#### Chain of responsibility");
        final Computer computer = new Computer(new Printer());
        computer.print();

        // Command
        System.out.println("#### Command");
        final MicrosoftPaint microsoftPaint = new MicrosoftPaint();
        microsoftPaint.draw();
        microsoftPaint.draw();
        microsoftPaint.draw();
        microsoftPaint.undo();
        microsoftPaint.undo();
        microsoftPaint.redo();

        // Interpreter
        System.out.println("#### Interpreter");
        final Literal l1 = new Literal("l1");
        final Literal l2 = new Literal("l2");
        final Comparison c1 = new Comparison(l1, "<", l2);
        final Comparison c2 = new Comparison(l2, "<", l1);
        final Logic l3 = new Logic(c1, "AND", c2);
        final Logic l4 = new Logic(l3, "OR", new Literal("true"));
        System.out.println(l4.evaluate());
    }
}
