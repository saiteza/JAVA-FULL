/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

//import java.util.Set;
//import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author sai
 */
public class Duplicate {
    public static void main(String[] sai){
      int [] a={2,3,4,5,6,3,45,6};  
 /*
 normal method       
//        
//                for(int i=0;i<a.length-1;i++){
//                    for(int j=i+1;j<a.length;j++){
//                        if(a[i]==a[j]){
//                            System.out.println(a[j]);
//                        }
//                    }
//                }
*/

 /*
 
 2nd method
 Set<Integer> s= new HashSet<>();
 for(int no:a ){
     if(s.add(no)==false){
         System.out.println(no);
     }
 }
   */
 Map<Integer,Integer> hm =new HashMap<>();
 for(int no:a){
     Integer count =hm.get(no);
     if(count==null){
         hm.put(no,1);
         
     }
     else
     {
         count=count+1;
         hm.put(no,count);
     }
 }
 System.out.println("Duplicate");
 Set<Map.Entry<Integer,Integer>> es=hm.entrySet();
 for(Map.Entry<Integer,Integer> me:es) {
        if(me.getValue()>1){
            System.out.print(me.getKey()+"  ");
        }
    }
    }
}
