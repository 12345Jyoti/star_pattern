import java.util.Scanner;

public class PalindromStr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String");
        String input=sc.next();
        String str=input;
        String rev="";
        int len=input.length();
        for (int i=len-1;i>=0;i--){
            rev=rev+input.charAt(i);
        }
        System.out.println(rev);
    }
}
