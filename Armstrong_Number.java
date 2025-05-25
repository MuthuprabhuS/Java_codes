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
public class Armstrong_Number {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int num=x.nextInt();
        int digit=0;
        int tempnum=num;
        int temp1=num;
        int temp2=1;
        int sum=0;
        
//To find the digit of the entered number:
        while(temp1 > 0){
            int a=temp1/10;
            digit++;
            temp1=a;
        }
//        System.out.println(digit);

//Doing operations to find the number is Armstrong or not:
        for(int i=0;i<digit;i++){
            int a=tempnum%10;
            for(int j=0;j<digit;j++){
                temp2*=a;
            }
            sum += temp2;
            temp2=1;
            tempnum/=10;
        }
//        System.out.println(sum);
        if(num == sum){
        System.out.println(num+" is an Armstrong Number");
        }
        else{
        System.out.println(num+" is not an Armstrong Number");}
    }
    
}
