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
public class Armstrong_Number_with_Power_Function {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int num=x.nextInt();
        int digit=0;
        int temp1=num;
        int tempnum=num;
        int temp2=0;
        int sum=0;
        while(temp1>0){
            temp1/=10;
            digit++;
        }
        while(tempnum>0){
            temp2=tempnum%10;
            sum+=Math.pow(temp2,digit);
            tempnum/=10;
        }
        if(num==sum){
          System.out.println(num+" is an Armstrong Number");
        }
        else{
            System.out.println(num+" is not an Armstrong Number");
        }
        
    }
}
