/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author sai
 */
public class Secondmax {
    public static void main (String[] sai){
        
        int [] a={5,55,4,44,66,6,8,9,87,7,5,45};
        int n=a.length;
        for(int i=0;i<n-1;i++){
              for(int j=1;j<n;j++){
                  if(a[j]>a[i]){
                    int  temp=a[i];
                      a[i]=a[j];   
                      a[j]=temp;
                  }
              }
if(i==1){
    break;
}
        }
        System.out.println(a[1]);
        
                }
    
    
}
