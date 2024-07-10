import java.util.Scanner;

public class ST1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter value of x: ");
        // String x=sc.next();
        method1(n);
        method2(n);method3(n);
        method4(n);

        }
    public static void method1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
        }
        System.out.println();
    }

    }
    public static void method2(int n) {
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        
    }}
    public static void method3(int n) {
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        
    }}
    public static void method4(int n) {
        char alph='a';
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(alph);
                alph++;
            }
            System.out.println();
        
    }}

}