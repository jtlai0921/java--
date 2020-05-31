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
        int n = 1;
        int number = 2;
        while (number <= 1024) {
            System.out.printf("n=%2d --> %d%n", n, number);
            n++;
            number = number * 2;
        }

        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 100;
        boolean isBoo = true;
        int ans = (int) (Math.random() * 100 + 1);//1-100
        do {
            System.out.printf("請猜 %d ~ %d：", min, max);
            int keyin = scanner.nextInt();
            if (keyin == ans) {
                System.out.println("猜中了!");
                isBoo = false;
            } else if (keyin > ans) {
                max = keyin;
            } else {
                min = keyin;
            }
        } while (isBoo);

        int count = 0;
        do {
            System.out.printf("第 %d 次輸入...%n", ++count);
            System.out.print("輸入密碼：");
            int userPw = scanner.nextInt();
            if (userPw == 1234) {
                System.out.println("驗證成功!");
                break;
            } else {
                if (count == 3) {
                    System.out.println("驗證失敗!卡片沒收");
                    break;
                } else {
                    System.out.println("密碼錯誤，請重新輸入!");
                }
            }
        } while (true);
    }
}
