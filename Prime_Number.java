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

public class Prime_Number {
    public static void main(String[] args){
        Scanner x= new Scanner(System.in);
        int num=x.nextInt(); 
        if(num>0){
            Boolean flag = Boolean.TRUE;
            for(int i=2;i<num;i++){
                if(num%i == 0){
                    flag=Boolean.FALSE;
                    break;
                }
            }
            if(flag == Boolean.TRUE){
                System.out.println("Prime Number");
            }
            else{
                System.err.println("Not a Prime Number");
            }
        }
        else{
            System.out.println("Entered not a positive number");
        }
    }
            
}
