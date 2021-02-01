
class insertsort{
  
  public static void main(String[] args) {
    

	        int current=0;
		int [] a ={1,253,4,65,6,7,8};
		for (int i=1;i<a.length;i++){
		    current= a[i];
		   int j=i-1;
		  while(a[j]>current && j>=0){
		           a[j+1]=a[j];
		           j--;
		   }
	
		   a[j+1]=current;
		   
	}
	for(int i=0;i<a.length;i++){
	        System.out.println(a[i]);
	}
	
}
}
    
  
