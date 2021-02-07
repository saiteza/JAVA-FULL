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
public class Missingnumber {
    public static void main(String[] sai){

int[] a={1,2,3,4,5,8};
int expected_no_elements=a.length+1;
int total_sum=expected_no_elements*(expected_no_elements+1)/2;
int sum=0;
for(int i=0;i<a.length;i++){
    sum=sum+a[i];
}
        System.out.println("missing no is :"+(total_sum-sum));
    }
}
