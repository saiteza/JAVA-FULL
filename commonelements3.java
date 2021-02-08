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
public class commonelements3 {
    public static void main(String[] sai){
        int a1[]={1,2,3,4,5};
        int a2[]={2,3,4,5,6};
        int a3[]={4,5,8,9,15};
        int x=0,y=0,z=0;
        ArrayList<Integer> al=new ArrayList<>();
        while(x<a1.length && y<a2.length && z<a3.length){
            if(a1[x]==a2[y]&&a2[y]==a3[z]){
                al.add(a1[x]);
                x++;
                y++;
                z++;
            }
            else if(a1[x]<a2[y]){
                x++;
            }
            else if(a2[y]<a3[z]){
                y++;
            }
            else{
                z++;
            
            }
            
        }
        for(int no:al){
            System.out.println(no);
        }
    }
}
