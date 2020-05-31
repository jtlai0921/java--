/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

/**
 *
 * @author jacki
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a1;
        a1 = 100;
        a1 = a1 + 50;
        System.out.println("a1=" + a1); //顯示 150

        int a2 = 19, b2 = 5;
        System.out.printf("%d + %d = %d%n", a2, b2, a2 + b2);
        System.out.printf("%d - %d = %d%n", a2, b2, a2 - b2);
        System.out.printf("%d * %d = %d%n", a2, b2, a2 * b2);
        System.out.printf("%d / %d = %d%n", a2, b2, a2 / b2);
        System.out.printf("%d %% %d = %d%n", a2, b2, a2 % b2);

        double c2 = 19.0, d2 = 5.0;
        System.out.printf("%.2f / %.2f = %.2f%n", c2, d2, c2 / d2);
        System.out.printf("%.2f %% %.2f = %.2f%n", c2, d2, c2 % d2);

        int a3 = 6;
        int b3 = a3++; //後置遞增，a3先將資料指派給b3後，再將a3加1
        System.out.printf("a3=%d ,b3=%d%n", a3, b3);

        int c3 = 6;
        int d3 = ++c3; //前置遞增，c3先加1後再將資料指派給d3
        System.out.printf("c3=%d ,d3=%d%n", c3, d3);

        int e = 20;
        int f = 15;
        int g = e-- - f;
        System.out.printf("e=%d ,f=%d ,g=%d%n", e, f, g);

        int a4 = 8, b4 = 3;
        System.out.printf("a4 = %d, b4 : %d%n", a4, b4);
        System.out.printf("a4 < b4 : %b%n", a4 < b4);
        System.out.printf("a4 >= b4 : %b%n", a4 >= b4);
        System.out.printf("a4 == b4 : %b%n", a4 == b4);

        int a5 = 1, b5 = 1, c5 = 1;
        System.out.printf("a5 = %d, b5 = %d, c5 = %d%n", a5, b5, c5);
        System.out.printf("a5>b5 || a5<=c5 = %b%n", a5 > b5 || a5 <= c5);
        System.out.printf("a5==b5 || a5==c5 = %b%n", a5 == b5 && a5 == c5);
        System.out.printf("a5<b5 || a5++>c5 = %b%n", a5 < b5 || a5++ > c5);
        System.out.printf("a5 = %d, b5 = %d, c5 = %d%n", a5, b5, c5);
        System.out.printf("a5<b5 && a5++>c5 = %b%n", a5 < b5 && a5++ > c5);
        System.out.printf("a5 = %d, b5 = %d, c5 = %d%n", a5, b5, c5);

        int a6 = 6;
        System.out.printf("%d 是 %s%n", a6, a6 % 2 == 1 ? "奇數" : "偶數");

        boolean booA;
        booA = 5 * 3 < 20 & 3 + 7 > 9 - 1 || 20 >= 20 - 30 || false;
        System.out.println("booA = " + booA);

        byte a7 = (byte) 257;
        System.out.println("a7 = " + a7);

    }

}
