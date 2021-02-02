public class Mergesort{
    int [] array;
    int[] temp;
    public static void main(String[] a) {
        int[] arr={1,6,0,26,12,11,10};
        
        Mergesort m=new Mergesort();
           m.sort(arr);  
           for(int i:arr){
               System.out.print(i+",");
           } 
            }    


public void sort(int arr[]) {
  
  System.out.println("hello1");
  this.array=arr;
   int leng=arr.length;
   this.temp=new int[leng];
   divideArray(0,leng-1);
   
}



public void divideArray(int lowerindex,int higherindex) {
    if(lowerindex<higherindex){
        int middle=lowerindex+(higherindex-lowerindex)/2;
        divideArray(lowerindex, middle);
        divideArray(middle+1, higherindex);
        mergeArray(lowerindex,middle,higherindex);
    }

}




public void mergeArray(int lowerindex,int middle,int higherindex)
{
    for (int i=lowerindex;i<=higherindex;i++)
    {
        temp[i]=array[i];
    }
    int i=lowerindex;
    int j=middle+1;
    int k=lowerindex;
    while(i<=middle && j<=higherindex)
    {
        if(temp[i]<=temp[j])
        {
            array[k]=temp[i];
            i++;
        }
        else{
            array[k]=temp[j];
            j++;
        }
        k++;
    }
    while(i<=middle){
        array[k]=temp[i];
        k++;
        i++;
    }
}



}