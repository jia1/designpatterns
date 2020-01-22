package com.jiayee.abstractfactory;

/**
 * Abstract factory for CatShelterFactory. "A factory of factories; a factory that groups the individual but related/dependent
 * factories together without specifying their concrete classes." "AbstractFactory classes are often implemented with factory
 * methods, but they can also be implemented using Prototype."
 *
 * 1. Factories as singletons. 3. Define extensible factories e.g. add a parameter to specify the kind of object to be created.
 * @author jylim
 */

public final class CatShelterFactoryFactory {
    public static CatShelterFactory getCatShelterFactory(final ShelterType shelterType) {
        if (shelterType == ShelterType.CUTE) {
            return new CuteCatShelterFactory();
        }
        return new UglyCatShelterFactory();
    }
}
