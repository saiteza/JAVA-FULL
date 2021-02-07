/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;
import java.util.ArrayList;
/**
 *
 * @author sai
 */
public class Evenodd {
    public static void main ( String[] sai){
        int a[]={1,2,3,4,5,6,7};
        ArrayList<Integer> a1=new ArrayList<>();
         ArrayList<Integer> a2=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                a1.add(a[i]);
            }
            else{
                a2.add(a[i]);
            }
            
        }
        
        System.out.println("even no's are");
        System.out.println("total even no's are "+a1.size());
        for(int no:a1)
        {
            
            System.out.print(no+" ");
            
        }
        System.out.print("\n");
          System.out.println("total odd no's are "+a2.size());
        System.out.println("odd no's are");
        for(int no:a2)
        {
            System.out.print( no+" ");
        }
        //System.out.println("\n");
    }
    
}
