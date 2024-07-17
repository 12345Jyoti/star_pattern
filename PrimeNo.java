import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
int num=1;
int count=0;
if(num>1){
    for(int i=2;i<=num;i++){
        if(num%i==0){
            count++;
        }
    }
    System.out.println("Prime");
}    
else{
    System.out.println("Not Prime");
}
method1();
}

public static void method1() {
    Scanner sc= new Scanner(System.in);
int num=0;
System.out.println("Enter the count: ");//4
    int count=sc.nextInt();
    
        while (num<count) { //0<4
            for(int i=2;i<=num;i++){ 
if(num%i==0){
    System.out.println(num);
    count++;
}
num++;
            }
        }

    }
    
}

