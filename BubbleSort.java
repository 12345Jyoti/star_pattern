import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
System.out.println("Enter the values: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
System.out.println("Arrays before srting "+ Arrays.toString(arr));
        // for(int i=0;i<n-1;i++){
        //     for(int j=0;j<n-1;j++){   ///2 4 6 1 2 
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }

        //     }

        // }
        // System.out.println("Arrays after srting "+ Arrays.toString(arr));

        Arrays.parallelSort(arr);
        System.out.println("Arrays after srting "+ Arrays.toString(arr));




    }
}