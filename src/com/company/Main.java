package com.company;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Student vadym = new Student();
        vadym.firstName = "Vadym";
        vadym.lastName = "che";
        vadym.age = 33;

        boolean old = vadym.isOld(33);
        System.out.println("vadym is old " + old);













        int sum = ttt (9, 9);
        System.out.println(sum);
    }

    static int ttt(int n, int t) {
        return (n * t);

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int diff(int a, int b) {
        return a -b;
    }
    static String text (int a, String b) {
        return a + b;
    }
    static int guardians (int a, int b){
        return  (a - b);
    }
}

