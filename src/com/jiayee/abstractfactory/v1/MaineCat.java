package com.jiayee.abstractfactory.v1;

/**
 * @author jylim
 */

public class MaineCat implements Cat {
    @Override
    public Mood eat(final Food food) {
        switch (food) {
            case FISH:
                return Mood.HAPPY;
            case LOLLIPOP:
                return Mood.SAD;
            default:
                return Mood.ANGRY;
        }
    }

    @Override
    public Sound makeSound() {
        return Sound.MEOW;
    }
}
