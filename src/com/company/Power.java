package com.company;

public class Power extends Service {

    static int getPower(int Num, int Pow) {
        int result = 1;
        for (int i = 1; i <= Pow; i++) {
            result = result * Num;
        }
        return result;
    }
}
