package com.company.lab5;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double x = s.nextDouble();
        double y = s.nextDouble();
        double z = s.nextDouble();

        if(x > 0) {
            System.out.format("%.4f;",Math.pow(x, 2));
        } else {
            System.out.print(x + ";");
        }

        if(y > 0) {
            System.out.format("%.4f;", Math.pow(y, 2));
        } else {
            System.out.print(y + ";");
        }

        if(z > 0) {
            System.out.format("%.4f;", Math.pow(z, 2));
        } else {
            System.out.print(z + ";");
        }
    }
}
