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
public class Leap_year {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int year=x.nextInt();
        if(year%4 == 0){
            if((year%100 == 0) && (year%400 ==0)){
                System.out.println(year+" Leap year");
            }
            else{
                System.out.println(year+" Not a Leap year");
            }
        }
        else{
            System.out.println(year+ " Not a Leap year");
        }
    }
}
