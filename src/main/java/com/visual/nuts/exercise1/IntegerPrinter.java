package com.visual.nuts.exercise1;

public class IntegerPrinter {
    private Divisor divisor;

    public IntegerPrinter() {
        divisor = new DivisorByThreeAndFive(new DivisorByFive(new DivisorByThree(null)));
    }

    public void print(Integer to) {
        for(int i = 1; i <= to; i++) {
           divisor.verify(i);
        }
    }
}
