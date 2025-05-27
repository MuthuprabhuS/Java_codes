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
public class Linear_search {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
/*-        System.out.print("enter no. of elements");    // for getting inputs from user
        int size = x.nextInt();
        System.out.println("enter the elements");
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]=x.nextInt();
        }    */

        int array[] = {5,4,3,2,1};
        int size = array.length;
        System.out.println("enter the element to find");
        int find=x.nextInt();
        int index=0;
        for(int i=0;i<size;i++){
            if(array[i]==find){
                index=i+1;
                break;
            }
        }
        if(index==0){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at "+index);
        }
    }
}
