import java.util.Scanner;

public class MaxAndMinValueInArray1 {
    public static void Main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array: ");
int size=sc.nextInt();
System.out.println("Enter the arrays: ");
int arr[]=new int[size];
int max=0;
int min=0;
for (int i=0;i<size;i++){
    arr[i]=sc.nextInt();
}
for(int i=0;i<size;i++){
    
    if(arr[i]<max){
        max=arr[i];
    }
    System.out.println(max);
}
}}
