package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// numar la puterea
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar: ");
        int n = Integer.parseInt(scanner.next());
        for(int i=1; i<=n;i++)
            System.out.println(i * i);
//            System.out.println(i*n);
    }
}
