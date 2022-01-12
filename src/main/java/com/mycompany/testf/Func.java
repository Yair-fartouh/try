/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testf;

/**
 *
 * @author YairF
 */
public class Func {

    public Func() {               //------ func for (a*b)
    }

    public int F(int a, int b) {
        int sum;
        int i;
        sum = a;
        for (i = b; i > 1; i--) {
            sum += a;
        }
        return sum;
    }

    public int assembly(int n) {      //------- func for(a!)
        int sum = 1;
        int i;
        for (i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;

    }
//------------------------------------------------- Suicide

    public int Suicide(int num) {
        int i;
        int Survive = 0;
        int sum = 0;
        int[] arr;
        arr = new int[num];
        for (i = 0; i < num; i++) {
            arr[i] = i + 1;
        }
        if ((num - 1) % 2 == 0) {
            arr[0] = 0;
            for (i = 0; i < num; i++) {
                if (i % 2 != 0) {
                    arr[i] = 0;
                } else {
                    sum++;
                }
            }
            if (sum == 1) {
                for (i = 0; i < num; i++) {
                    if (arr[i] != 0) {
                        Survive = arr[i];
                        break;
                    }
                }
            }

        }
        return Survive;
    }
//---------------------------------------------------------

    public double Divide(double a, double b) throws Exception {
        double result;
        if (b == 0) {
            throw new ArithmeticException("number b can't be 0");
        } else {
            if (a == 0) {
                return 0;
            }
            result = a / b;
            return result;
        }
    }

    public double add(double a, double b) {
        double result;
        result = a + b;
        return result;
    }

}
