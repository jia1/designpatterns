package com.jiayee.abstractfactory;

import java.util.List;

/**
 * Factory interface containing the factory method for a/an *CatShelter i.e. gatherCats.
 * @author jylim
 */

public interface CatShelterFactory {
    List<Cat> gatherCats();
}
