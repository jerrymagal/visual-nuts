package com.visual.nuts.exercise1;

public class DivisorByThreeAndFive extends Divisor {

    public DivisorByThreeAndFive(Divisor divisor) {
        super(divisor);
    }
    @Override
    public void verify(int value) {
        if(value % 3 == 0 && value % 5 == 0) {
            System.out.println("Visual Nuts");
        } else {
            if(getDivisor() != null) {
                getDivisor().verify(value);
            } else {
                System.out.println(value);
            }
        }
    }
}
