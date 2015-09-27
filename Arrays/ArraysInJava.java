import java.util.Scanner;

public class ArraysInJava {

    public static void main(String[] args) {
        
        int sum=0, temp=0, neg=0;
        System.out.println("Enter the number of elements in th array:");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out .println("Enter the elements:");
        int arr[] = new int[n];
        
        for ( int k=0; k<n; k++)
         {
            arr[k]= sc.nextInt();
            
         }
        
        for( int i=0; i<n; i++ )
         {
           sum =0;
           for ( int j=i; j<n; j++)
            {
               temp = arr[j];
               sum+=temp;
               if(sum<0)
                   neg++;
            }
            
         }
        System.out.println("Number of negative subarrays is:"+neg);
        
    }
}







