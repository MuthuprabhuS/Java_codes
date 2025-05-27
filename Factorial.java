/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variable;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.err.println("factorial of "+num+" is "+fact);
    }
}
