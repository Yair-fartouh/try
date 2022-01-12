/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.testf;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author YairF
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Func A;
//        int a,b;
//        A = new Func();
//        Scanner sc1 = new Scanner(System.in);
//        Scanner sc2 = new Scanner(System.in);
//        a = sc1.nextInt();
//        b = sc1.nextInt();
//        System.out.println(A.F(a, b));

//------------------------------------
//        Func N;
//        N = new Func();
//        int num;
//        Scanner sc;
//        sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        num = sc.nextInt();
//        System.out.println(N.assembly(num));
//--------------------------------------
//        Func s;
//        s = new Func();
//        int num;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Suicide");
//        num = sc.nextInt();
//        System.out.println(s.Suicide(num));
//--------------------------------------
        try{
        Func f;
        f = new Func();
        double a;
        double b;
        Scanner sc;
        sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("div: " + f.Divide(a, b));
        System.out.println("add: " + f.add(a, b));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
