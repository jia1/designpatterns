package com.jiayee.abstractfactory;

/**
 * "Program to an interface, not an implementation." "Favor object composition over object inheritance."
 * @author jylim
 */

public interface Cat {
    Mood eat(final Food food);

    Sound makeSound();
}
