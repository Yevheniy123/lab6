package com.company;
public class SecondM implements IMatch{
    @Override
    public boolean match(int number1, int number2) {
        int max;
        if (number1 >= number2) {
            max = number1;
        } else {
            max = number2;
        }
        int count = 0;
        for (int i=2; i<=max; i++) {
            if (number1 % i == 0 && number2 % i==0) {
                count++;
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }
}
