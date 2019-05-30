package com.company;

public class Power extends Service {

    static double getPower(int Number, int Power) {
        double result = 1;
        for (int i = 1; i <= Math.abs(Power); i++)
                result = result * Number;
        if (Power < 0)
                result = 1 / result;
        return result;
    }
}
