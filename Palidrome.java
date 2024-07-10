import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        int rev=0;
        int temp=number;
        while(number!=0){
            rev=(rev*10)+(number%10);
            number=number/10;
        }
        if(rev==temp){
            System.out.println("palidrome");

        }
        else{
            System.out.println("not palidrome");
        }
    }
}
