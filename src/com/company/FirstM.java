package com.company;

public class FirstM implements IMatch {
    @Override
    public boolean match(int number1, int number2) {

        if (number1>number2)
        {return true;}
        else return false;
    }
}
