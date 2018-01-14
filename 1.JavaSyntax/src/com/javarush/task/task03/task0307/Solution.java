package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {

        Zerg[] aZerg = new Zerg[10];
        for (int i = 0; i < aZerg.length; i++) {
            aZerg[i] = new Zerg();
            aZerg[i].name = "zerg" + (i + 1);
            System.out.println(aZerg[i].name);
        }

        Protoss[] aProtoss = new Protoss[5];
        for (int i = 0; i < aProtoss.length; i++) {
            aProtoss[i] = new Protoss();
            aProtoss[i].name = "protoss" + (i + 1);
            System.out.println(aProtoss[i].name);
        }

        Terran[] aTerran = new Terran[12];
        for (int i = 0; i < aTerran.length; i++) {
            aTerran[i] = new Terran();
            aTerran[i].name = "terran" + (i + 1);
            System.out.println(aTerran[i].name);
        }

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
