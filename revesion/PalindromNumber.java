import java.util.Scanner;

public class PalindromNumber {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no: ");

        int N1=sc.nextInt();    //121   12
        int dup=N1;    //121
        int rev=0;   //1
        while(N1>0){
            int ld= N1%10;  //1      2
            rev = rev*10+ld; ///1 121  10+2
            N1=N1/10;   //12   
        }
        if(rev==dup){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }



    }}