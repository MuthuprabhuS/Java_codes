/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variable;

/**
 *
 * @author admin
 */
class Grandfather{
    int a=10000;
    public void Printing(){
        System.out.println(a);
    }
}
class Father extends Grandfather{
    int b=20000;
    @Override
    public void Printing(){
        System.out.println(b);
    }
}
class Son extends Father{
    int c=30000;
    @Override
    public void Printing(){
        System.out.println(c);
    }
}
public class overriding {
    public static void main(String[] args){
    Grandfather x = new Grandfather();
    Father y = new Father();
    Son z= new Son();
    x.Printing();
    y.Printing();
    z.Printing();
}
}
