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
public class Firstduplicate {
    public static void main(String[] sai){
        
    
    int [] a={1,2,3,4,1,2,3};
    int n=a[0];
    for(int i=1;i<a.length;i++){
    n=n^a[i];
        
        
}
    System .out.println(n);
    
    
    }
}
