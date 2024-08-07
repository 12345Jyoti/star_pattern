
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int Factorial = 1;   //1
        for(int i=1; i<=num;i++){    //i==1   i==2
            Factorial=i*Factorial;    //1*1   1
        }
        System.out.println(Factorial);
    }
}
