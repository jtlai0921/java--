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

        System.out.println("第1行，資料顯示完成換行!");
        System.out.print("第2行，資料顯示完成不換行!");
        System.out.print("\n第3行，使用\"\\n\"換行\n");

        System.out.println(1 + 3 + 5);    //加號 9
        System.out.println("1" + 3 + 5);  //字串串接 "135"
        System.out.println("1" + (3 + 5));// "18"

        String name = "Tom";
        int age = 10;
        double height = 123.45;
        System.out.println("我是" + name + "，今年" + age + "歲，身高" + height + "公分");
        System.out.printf("我是%s，今年%d歲，身高%f公分%n", name, age, height);

        System.out.printf("%6d%n", 654321);
        System.out.printf("%6d%n", 54321);
        System.out.printf("%6d%n", 4321);
        System.out.printf("%6d%n", 321);
        System.out.printf("%6d%n", 21);
        System.out.printf("%6d%n", 1);

        String type = "A";
        System.out.printf("%s%04d%n", type, 1);	  //A0001
        System.out.printf("%s%04d%n", type, 24);   //A0024
        System.out.printf("%s%04d%n", type, 135);  //A0135
        System.out.printf("%s%04d%n", type, 2468); //A2468 

        System.out.printf("%6.2f%n", 123.456789);
        System.out.printf("%6.2f%n", 12.3456789);
        System.out.printf("%6.2f%n", 1.23456789);

    }

}
