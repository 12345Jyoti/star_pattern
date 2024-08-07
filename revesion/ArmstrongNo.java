

public class ArmstrongNo {
    public static void main(String[] args) {
    int number=159;
    int dup=number;
    int sum=0;

    while(number>0){
        int ld=number%10;
        sum=sum+(ld*ld*ld);
        number=number/10;

    }
    if(dup==sum){
        System.out.println("Yes");
    }
    else{
        System.out.println("false");
    }

}
    
}
