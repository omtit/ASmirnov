package com.company.lab6;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int w = s.nextInt();
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        int e = 1;
        int f = 1;
        int g = 1;
        int h = 1;

        if(w < 0 || w > 20) {
            System.out.println("Значение W должно быть в интервале [0, 20]");
            return;
        }

        while(a <= w) {
            if(a == w) {
                System.out.println("a");
            } else {
                System.out.print("a");
            }

            a++;
        }

        while(b <= w) {
            if(b == w) {
                System.out.println("b");
            } else {
                System.out.print("b");
            }

            b++;
        }

        while(c <= w) {
            if(c == w) {
                System.out.println("c");
            } else {
                System.out.print("c");
            }

            c++;
        }

        while(d <= w) {
            if(d == w) {
                System.out.println("d");
            } else {
                System.out.print("d");
            }

            d++;
        }

        while(e <= w) {
            if(e == w) {
                System.out.println("e");
            } else {
                System.out.print("e");
            }

            e++;
        }

        while(f <= w) {
            if(f == w) {
                System.out.println("f");
            } else {
                System.out.print("f");
            }

            f++;
        }

        while(g <= w) {
            if(g == w) {
                System.out.println("g");
            } else {
                System.out.print("g");
            }

            g++;
        }

        while(h <= w) {
            if(h == w) {
                System.out.println("h");
            } else {
                System.out.print("h");
            }

            h++;
        }





    }
}
