import java.util.Scanner;

public class LinearSerch {
    public static void main(String[] args) {

Scanner sc= new Scanner(System.in);
int size=5;
int k=10;
boolean flag=false;
int arr[]=new int[size];
for(int i=0;i<size;i++){
    arr[i]=sc.nextInt();
}
for(int i=0;i<size;i++){
    if(k==arr[i]){
        System.out.println("Found Element");
        flag=true;
        break;
    }
}
if(flag==false){
    System.out.println("Not Found");
}


    }
}