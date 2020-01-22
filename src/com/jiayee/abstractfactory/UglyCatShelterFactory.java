package com.jiayee.abstractfactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Concrete factory. "A concrete factory is often a singleton."
 * @author jylim
 */

public class UglyCatShelterFactory implements CatShelterFactory {
    @Override
    public List<Cat> gatherCats() {
        return new ArrayList<>(Collections.singletonList(new SphynxCat()));
    }
}
