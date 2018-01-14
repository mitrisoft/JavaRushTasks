package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

import javax.swing.text.MutableAttributeSet;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        return (number/100)%10 + (number/10)%10 + number%10;
//        String s = Integer.toString(number);
//        return Integer.parseInt(s.substring(0,1)) + Integer.parseInt(s.substring(1,2)) + Integer.parseInt(s.substring(2));
    }
}