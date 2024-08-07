
public class PalindromeString {

    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter String: ");
        String str="ABA";

        String dup=str;
        String rev=" ";

        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        System.out.println(rev);


        if(str.toLowerCase().equals(rev.toLowerCase())){
            System.out.println("Palindrome"); 
        }
            else{
                System.out.println("NotPalindrome");
            }

        
    }
}


