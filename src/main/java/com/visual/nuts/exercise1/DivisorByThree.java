package com.visual.nuts.exercise1;

public class DivisorByThree extends Divisor {

    public DivisorByThree(Divisor divisor) {
        super(divisor);
    }
    @Override
    public void verify(int value) {
        if(value % 3 == 0) {
            System.out.println("Visual");
        } else {
            if(getDivisor() != null) {
                getDivisor().verify(value);
            } else {
                System.out.println(value);
            }
        }
    }
}
