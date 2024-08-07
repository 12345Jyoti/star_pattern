
import java.util.Arrays;

public class BinarySerch1 {
    public static void main(String[] args) {
        boolean flag=false;
        int arr[]={1,3,2,4,6,7};
        int key =8;

        int l=0;
        int h=5;

        Arrays.sort(arr);
        while(l<=h){
            int m =(l+h)/2;

            if(key==arr[m]){
                System.out.println("Found");
                flag=true;
                break;
            } if(key>arr[m]){
                l=m+1;
            }
             if(key<arr[m]){
                h=m-1;
            }

           
        }
        if(flag==false){
            System.out.println("Not found");
        }
        
    }
    
}
