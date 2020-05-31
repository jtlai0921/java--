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
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            total = total + i;
        }
        System.out.println("total = " + total);

        total = 0;
        for (int i = 10; i > 0; i -= 2) {
            total = total + i;
        }
        System.out.println("total = " + total);

        for (int x = 1; x <= 9; x++) {
            for (int y = 2; y <= 9; y++) {
                System.out.printf("%dx%d=%2d ", y, x, x * y);
            }
            System.out.println();
        }

        total = 0;
        for (int i = 1; i <= 20; i++) {
            total = total + i;
            System.out.printf("%d  ", i);
            if (total > 100) {
                break;
            }
        }
        System.out.printf("，total =  %d%n", total);

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.printf("%d  ", i);
        }
        System.out.println();

        outer:
        for (int x = 3; x <= 5; x += 2) {
            for (int y = 3; y <= 7; y++) {
                System.out.printf("%dX%d=%2d%n", x, y, x * y);
                if (x * y > 15) {
                    break outer;
                }
            }
        }
    }
}
