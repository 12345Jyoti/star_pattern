
import java.util.Scanner;

public class MissingDigiit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(arr[i]==arr[i+1]){
                int x=arr[i];
                System.out.println("duplicate array is: "+x);
                break;

            }
        }
    }
    
}
