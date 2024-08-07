
import java.util.Arrays;

public class LinearSOrt1 {
    public static void main(String[] args) {

        int arr[]={2,5,1,7,3,4};

        for(int i=0;i<arr.length-1;i++){

        
        for (int idx = 0; idx < arr.length-1; idx++) {
            if(arr[idx]>arr[idx+1]){
                int temp=arr[idx];
                arr[idx]=arr[idx+1];
                arr[idx+1]=temp;

            }
            }

        }
        
        System.out.println(Arrays.toString(arr));
    }
}
