/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author sai
 */
public class merge {
      public static void main(String[] args) {

       /*    
          casting
          */   
       System.out.println("**************** casting **********************");
       System.out.println("casting double into int");
          double x = 9.997;
int aftercast = (int) x;
System.out.println(aftercast);

System.out.println("casting char to int");
char a='b';
int aftercast1=a;
System.out.println(aftercast1);

/* Switchcase

*/
System.out.println("**************** switch-case **********************");

   Scanner in=new Scanner (System.in);  
   System.out.println("enter the number between 1-3 ");
   int number=in.nextInt();
    switch(number){  
     
    case 1: System.out.println("you are number 1");  
    break;  
    case 2: System.out.println("you are number 2");  
    break;  
    case 3: System.out.println("you are number 3");  
    break;  
   
    default:System.out.println("Not in 10, 20 or 30");  
    }  


    
    System.out.println("**************** forloop**********************");
    for(int i=0;i<5;i++){
        System.out.println(i);
    }
    
    System.out.println("**************** nested for loop**********************");
      for(int i=0;i<5;i++){
          for(int j=0;j<5;j++){
              
        System.out.print(i);
         System.out.print(j);
    }
    }
      
      int i=1;
        System.out.println("**************** while loop**********************");
        while( i<=5)
        {
       
            System.out.println(i);
    i++;
    
      }
  
     
    
      }
}
 
