/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入西元年：");
        int year = scanner.nextInt();
        System.out.println("西元" + year + "年是民國" + (year - 1911) + "年");
        System.out.printf("西元%d年是民國%d年%n", year, year - 1911);

        System.out.print("輸入2個小數，用空白隔開：");
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        System.out.println(d1 + " + " + d2 + " = " + (d1 + d2));
        System.out.printf("%f + %f = %f%n", d1, d2, d1 + d2);

        System.out.print("輸入名字：");
        String inputname = scanner.next();
        System.out.printf("Hi! %s%n", inputname);
        System.out.print("請中翻英 這是一本書。 --> ");
        scanner.nextLine();//先清空		
        String input = scanner.nextLine();
        System.out.println(input);
    }

}
