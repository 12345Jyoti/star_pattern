import java.util.Scanner;

public class ReplaceWHiteSpace {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println(str);

        str=str.replaceAll("\\s", "");
        System.out.println(str);

    }
}