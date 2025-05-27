/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.variable;

/**
 *
 * @author admin
 */


public class Variable {
    private int x;
    private int y;
    private int z;
    public Variable(int x, int y){
    this.x=x;
    this.y=y;
    }
    public void setZ(int z){
    this.z=z;
    }
    public int getZ(){
    return z;
    }
  

    public static void main(String[] args) {
        /*int A = 10;
        System.out.println("Hello World!");
        System.out.println("value of A "  + A);
        int b=0;
        do{
            System.out.print(b);
            b++;
        }while(b<0);
        */
        
        Variable v1=new Variable(10, 11);
        Variable v2=new Variable(11, 10);
        System.out.println(v1.x +" "+ v1.y +" "+ v2.x +" "+  v2.y);
        v1=v2;
        System.out.println(v1.x +" "+ v1.y +" "+ v2.x +" "+  v2.y);
        v1.x=12;
        System.out.println(v1.x +" "+ v1.y +" "+ v2.x +" "+  v2.y);
        v2.y=15;
        System.out.println(v1.x +" "+ v1.y +" "+ v2.x +" "+  v2.y);
        
        v1.setZ(55);
        System.out.println(v1.getZ());
    }
}
