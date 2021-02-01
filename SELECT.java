  public class Main
{
	public static void main(String[] args) {
		int [] a ={1,2,3,4,5,6,7,8};
		for (int i=0;i<a.length;i++){
		   int min=i;
		    for(int j=i+1;j<a.length;j++){
            if(a[j]<a[min]){
                min=j;
            }		  
            
            
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
		    }
		    System.out.println(a[i]);
		}
	}
}
