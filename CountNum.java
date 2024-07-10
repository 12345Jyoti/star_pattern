import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter number")); 
        int num = sc.nextInt();//1234567
        int count=0; //0,1
        while(num>0){ 
            num=num/10;  //123456
            count++; //1
        }
        System.out.println(count);
        method1();
    }
    public static void method1(){
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter number"));
        int num = sc.nextInt();//1234567

        int even=0;
        int odd=0;
        while (num>0){
        if(num%2==0) {
        even++;
        }
        else {
        odd++;
        }
        num=num/10;
        }
        System.out.println("The count of even no is "+even +" and odd no is "+odd);
    }
}
