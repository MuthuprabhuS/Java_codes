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
public class Alphabet_number_check {
    public static void main(String[] args){
       Scanner x= new Scanner(System.in);
       String s=x.nextLine();
       int size=s.length();
       for(int i=0;i<size;i++){
           char c=s.charAt(i);
           if((c>=65 && c<=90)||(c>=97 && c<=122)){
               System.out.println(c+" Alphabet");
           }
           else if(c>=48 && c<=57){
               System.out.println(c+ "  Number");
           }
           else{
           System.out.println(c+" Special Character");
           }
       }
    }
    
}
