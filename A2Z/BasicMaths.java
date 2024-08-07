public class BasicMaths {
    public static void main(String[] args) {

        int x=545;
        

            int rev=-121;
            while(x>0){
                int lastDigit = x%10;
                rev=rev*10+lastDigit;
                x=x/10;
            }
            // return rev;
    
            if(x!=rev){
                System.out.println(true);;
            }
            else {
                System.out.println(false);;
            }
            
        
    }
    
}
