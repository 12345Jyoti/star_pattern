import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
int size=5;
int arr[]=new int[size];
System.out.println("Enter the array");
for(int i=0;i<size;i++){
   arr[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<size;i++){
    sum=sum+arr[i];
}
System.out.println(sum);
    }
}