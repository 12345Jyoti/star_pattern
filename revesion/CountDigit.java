import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter No: ");
        int number = sc.nextInt();
        int CountDigit=0;

        while(number>0){
            int lastDigit=number%10;
            CountDigit++;
            number=number/10;
        }
        System.out.println(CountDigit);

    }
    
}
