import java.util.*;
public class weekone {
	//Java Virtual Machine(JVM) Basics
	/*        First Java Program
4. Variables in Java
5. Java Data Types
6. Java Operators
7. If-else in Java
8. Switch-Case in Java11
9. Java For loop
10. Java While loop
11. do-while loop in Java
12. Java Continue statement
13. Java Break statement*/
	public static void main(String[] sai) {
		Scanner in=new Scanner (System.in);
		System.out.println("give two values");
		int a=in.nextInt();
		int b=in.nextInt();
		
		int sum=a+b;
		int Sub=a-b;
		int remi=a%b;
		int div=a/b;
		int mul=a*b;
	
	  
	   System.out.println("sum:1 sub:2 mul:3 div:4 remi:5");
	   int number=in.nextInt();
	    switch(number){  
	     
	    case 1: System.out.println("sum is  "+sum);  
	   break;  
	 
	    case 2: System.out.println("sub is "+Sub);  
	    break;  
	    case 3: System.err.println("mul  is"+mul);  
	    break;  
	    case 4: System.out.println("div  is"+div);  
	    break;  
	    case 5: System.out.println("reminder  is"+remi);  
	    break;  
	    default:System.out.println("");  
	    }	
		
	    System.out.println("smaller number from given two numbers");
		if(a>b) {
			System.out.println(b);
		}
	
		else {
			System.out.println(a);
		}
		int j=0;
            System.out.println("while loop");
		while( j<=a)
        {
			j++;
       if(j==2 ) {
    	   System.out.println("continue");
    	   continue;
    	   
    	   
       }
            System.out.println(j);
            
        
        }
		
		
	}
	

}
 