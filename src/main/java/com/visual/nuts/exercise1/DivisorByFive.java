package com.visual.nuts.exercise1;

public class DivisorByFive extends Divisor {

    public DivisorByFive(Divisor divisor) {
        super(divisor);
    }
    @Override
    public void verify(int value) {
        if(value % 5 == 0) {
            System.out.println("Nuts");
        } else {
            if(getDivisor() != null) {
                getDivisor().verify(value);
            } else {
                System.out.println(value);
            }
        }
    }
}
