import java.util.Scanner;

public class ExtractEvenOddFromArray {
    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array");
int size=sc.nextInt();
 System.out.println("Enter the array");

int arr[]=new int[size];
for(int i=0;i<size;i++){

    arr[i]=sc.nextInt();
}
System.out.println("Even no are:");
for (int i =0;i<size;i++) {
    if(arr[i]%2==0){
        System.out.println(arr[i]);;
    }}
    System.out.println("Odd No Are: ");
   for(int j=0;j<size;j++){
        if(arr[j]%2!=0){
            System.out.println(arr[j]);
        }
        
    }
    }
    
}
    
