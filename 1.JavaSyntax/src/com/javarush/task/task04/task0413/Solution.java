package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
String mon;
switch (num) {
    case 1:
        mon = "понедельник";
        break;
    case 2:
        mon = "вторник";
        break;
    case 3:
        mon = "среда";
        break;
    case 4:
        mon = "четверг";
        break;
    case 5:
        mon = "пятница";
        break;
    case 6:
        mon = "суббота";
        break;
    case 7:
        mon = "воскресенье";
        break;
        default:
            mon = "такого дня недели не существует";
            break;
}

        System.out.println(mon);
    }
}