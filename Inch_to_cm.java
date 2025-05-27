/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */

import java.util.Scanner;
public class Inch_to_cm {
    public static void main(String[] args){
        Scanner x= new Scanner(System.in);
        double inch=x.nextDouble();
        double cm=inch*2.54;
        System.out.println(inch+" inch is equal to: "+cm+" cm");
    }
}
