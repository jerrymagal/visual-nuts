package com.visual.nuts.exercise1;

public abstract class Divisor {
    private Divisor divisor;

    public Divisor(Divisor divisor) {
        this.divisor = divisor;
    }

    public Divisor getDivisor() {
        return divisor;
    }

    public abstract void verify(int value);
}
