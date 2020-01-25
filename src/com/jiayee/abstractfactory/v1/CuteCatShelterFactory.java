package com.jiayee.abstractfactory.v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Concrete factory. "A concrete factory is often a singleton."
 * @author jylim
 */

public class CuteCatShelterFactory implements CatShelterFactory {
    @Override
    public List<Cat> gatherCats() {
        return new ArrayList<>(Arrays.asList(new MaineCat(), new CalicoCat()));
    }
}
