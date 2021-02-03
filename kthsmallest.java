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
public class kthsmallest {
    
 
    public static void main(String[] sai){
        int [] a={1,5,8,2,4,9,3};
           int n=a.length,m=5;
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(i==m-1){
                System.out.println(a[m-1]);
            }
        }
        
    }
    
}
