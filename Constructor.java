/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variable;

/**
 *
 * @author admin
 */
public class Constructor {
    int item;
    public Constructor(){
        this.item=0;
    }
    public Constructor(int item){
    this.item=item;
    }
    public static void main(String[] args){
      Constructor ob1=new Constructor();
      Constructor ob2= new Constructor(10);
      
      System.out.println(ob1.item);
      System.out.println(ob2.item);
    }
}
