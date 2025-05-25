/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variable;

/**
 *
 * @author admin
 */
/*  import java.util.*;     */


class addition{
    
/*
    int a;
    int b;
    public addition(int a,int b){
        this.a=a;
        this.b=b;
    }
*/
    void add(int a){
        System.out.println(a);
    }
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(float a,float b){
        System.out.println(a+b);
    }
}
public class overloading {
    public static void main(String[] args){
        addition ad=new addition();
        ad.add(5);
        ad.add(5, 10);     
        ad.add(5.1f, 1.0f);
    }
     
}
