import java.util.Scanner;

public class  MaxAndMinValueInArray{
    public static void main(String[] args) {
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
    
    if(arr[i]>max){
        max=arr[i];
    }
   
}
System.out.println("Max value "+max);

    }
}