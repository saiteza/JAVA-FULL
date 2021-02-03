

/**
 *
 * @author sai
 */
public class Binarysearch {
    public static void main (String[] a){
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println("hello");
                int searchitem=10;
                int left=0;
                int right=arr.length;
                 System.out.print(right);
                int middle=right/2;
                while(left<=right){
                if(searchitem==arr[middle]){
                    System.out.print("yes");
                    break;
                }
                else if(searchitem>arr[middle]){
                    left=middle+1;
                    System.out.print (left);
                }
                else
                {
                    right=middle-1;
                     System.out.print(right);
                }
                middle=(left+right)/2;
                 System.out.print(middle);
                }
    }
    
}
