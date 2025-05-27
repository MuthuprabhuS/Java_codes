/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */

import java.util.Scanner;
public class Odd_or_Even {
    public static void main(String[] args){
        Scanner x= new Scanner(System.in);
        int num = x.nextInt();
        if(num%2==0){
            System.out.println(num+" is Even");
        }
        else{
            System.out.println(num+" is Odd");
        }
    }
}
