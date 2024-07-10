import java.util.Scanner;
public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ente number");
         int number=sc.nextInt();//123456 12345
         int sum=0; //0 6
         while (number>0) { 
            int x=number%10; //6 5
            number=number/10; //12345
            
            sum=sum+x; //6+5
         }
         System.out.println(sum);


    }
}