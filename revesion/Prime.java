public class Prime {
    public static void main(String[] args) {
        int num=2;
        int CountDigit=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                CountDigit++;
            }
        }
        if(CountDigit==2){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
