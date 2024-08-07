
import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N1=sc.nextInt();
        int N2=sc.nextInt();

        while(N1>0 && N2>0){    //11    12

            if(N1>N2){ 
                N1=N1%N2;
            }
            else{
                N2=N2%N1;   //n2=11
            }
            
        }
        if(N1==0){
            System.out.println("GCD is : "+N2);
        }
        else{
            System.out.println("GCD is : "+N1);

        }
    }
    
}
