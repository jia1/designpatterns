package com.jiayee.abstractfactory;

/**
 * @author jylim
 */

public class CalicoCat implements Cat {
    @Override
    public Mood eat(final Food food) {
        switch (food) {
            case FISH:
                return Mood.ANGRY;
            case LOLLIPOP:
                return Mood.SAD;
            default:
                return Mood.HAPPY;
        }
    }

    @Override
    public Sound makeSound() {
        return Sound.PURR;
    }
}
