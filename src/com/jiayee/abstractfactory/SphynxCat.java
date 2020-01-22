package com.jiayee.abstractfactory;

/**
 * @author jylim
 */

public class SphynxCat implements Cat {
    @Override
    public Mood eat(final Food food) {
        return Mood.ANGRY;
    }

    @Override
    public Sound makeSound() {
        return Sound.HISS;
    }
}
