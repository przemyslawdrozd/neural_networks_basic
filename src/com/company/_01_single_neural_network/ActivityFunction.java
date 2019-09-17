package com.company._01_single_neural_network;

public class ActivityFunction {

    public static int stepFunction(float activation) {

        if (activation >= 1) return 1; //threshold

        return 0;
    }
}
