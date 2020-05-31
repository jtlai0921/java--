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
        System.out.print("請輸入密碼：");
        int pw = scanner.nextInt();
        if (pw == 1234) {
            System.out.println("登入成功");
        } else {
            System.out.println("登入失敗");
        }
        System.out.println("其他程式...\n");

        //---------------------------------------
        System.out.print("請輸入預算：");
        int budget = scanner.nextInt();
        if (budget >= 5000) {
            System.out.println("台北一日遊");
        } else if (budget >= 2500) {
            System.out.println("台中一日遊");
        } else if (budget >= 1500) {
            System.out.println("台南一日遊");
        } else {
            System.out.println("高雄一日遊");
        }

        //-------------------------------------
        System.out.print("請輸入西元年：");
        int year = scanner.nextInt();
        if (year % 400 == 0) {
            System.out.printf("%d 年是閏年%n", year);
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    System.out.printf("%d 年不是閏年%n", year);
                } else {
                    System.out.printf("%d 年是閏年%n", year);
                }
            } else {
                System.out.printf("%d 年不是閏年%n", year);
            }
        }

        //-------------------------------------
        
        System.out.print("輸入成績：");
        int score = scanner.nextInt();
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("-->A");
                break;
            case 8:
                System.out.println("-->B");
                break;
            case 7:
                System.out.println("-->C");
                break;
            case 6:
                System.out.println("-->D");
                break;
            default:
                System.out.println("-->E");
        }

    }
}
