package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        long l = 1;
        for (int i = 1; i <= 10; i++) {
            l = l * i;
        }
        System.out.println(l);
    }
}
