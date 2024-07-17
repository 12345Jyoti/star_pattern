import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        System.out.println("Enter the key which have to search: ");
        int key =sc.nextInt();
        System.out.println("Enter the array values: ");
        int arr[]=new int[size];
        boolean flag=false;
        int l=0;
        int h=arr.length;
      
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
       while (l<=h) {
        int m=(l+h)/2;
        if(key==arr[m]){  
            System.out.println("Element Found");
            flag=true;
            break;
        }
        if(key>arr[m]){
            l=m+1;
        }
        if(key<arr[m]){
            h=m-1;
        }
        
       }
if(flag==false){
    System.out.println("Element Not Fond!!");

}
    }
}