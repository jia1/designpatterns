package com.jiayee.creationalpatterns.abstractfactory.v1;

import java.util.List;

/**
 * Factory interface containing the factory method for a/an *CatShelter i.e. gatherCats.
 * @author jylim
 */

public interface CatShelterFactory {
    List<Cat> gatherCats();
}
