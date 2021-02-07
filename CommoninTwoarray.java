/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;
import java.util.*;
/**
 *
 * @author sai
 */
public class CommoninTwoarray {
     public static void main(String [] sai){
         
       int []    a={1,2,5,7,9};
        int []   b={1,3,4,9,10};
        HashSet<Integer> hs= new HashSet<>();
         for(int i=0;i<a.length;i++){
              for(int j=0;j<b.length;j++){
                  if(a[i]==b[j]){
                      hs.add(a[i]);
                      break;
                      
                  }
                  
                  
              }
              
         }
for(int i:hs){
      System.out.print(i);
}
     }
    
}
