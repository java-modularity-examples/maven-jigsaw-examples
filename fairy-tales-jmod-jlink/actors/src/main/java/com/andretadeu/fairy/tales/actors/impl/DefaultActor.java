package com.andretadeu.fairy.tales.actors.impl;

import com.andretadeu.fairy.tales.actors.Actor;

/**
 * Default implementation of {@link Actor}
 */
public class DefaultActor implements Actor {
    private final String name;

    public DefaultActor(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return name();
    }
}
