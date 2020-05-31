/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

/**
 *
 * @author jackie
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(10);
        System.out.println(2147483647);
        System.out.println(2147483648L);

        int i1 = 100;
        int i2 = 200;
        System.out.println(i1 + i2);

        System.out.println(12345);
        System.out.println(0b11000000111001);
        System.out.println(030071);
        System.out.println(0x3039);

        System.out.println(1.23);
        System.out.println(1.23F);

        double d1 = 1.23;
        float f1 = 4.56F;
        System.out.println(d1 + f1);

        System.out.println(0b11_____0000_00__11_1__001);
        System.out.println(2_147_483_647);

        System.out.println('A');
        System.out.println('熱');
        System.out.println('\u0041');
        System.out.println("Java\t8.0\nAndroid\t7.1.1");
        System.out.println("\u71b1\u5496\u5561");

        boolean booA = true;
        boolean booB = !booA;
        System.out.println(booA);
        System.out.println(booB);
    }

}
