package kmo.java13;

import java.time.Month;

public class SwitchExpressions {

    public static int getSeason(final Month month) {
        return switch (month) {
            case JANUARY, FEBRUARY, MARCH -> 1;
            case APRIL, MAY, JUNE -> 2;
            case JULY, AUGUST, SEPTEMBER -> 3;
            case OCTOBER, NOVEMBER, DECEMBER -> 4;
        };
    }
}
