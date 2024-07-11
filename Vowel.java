//  Write a Java program to check if a vowel is present in a string

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        int count=0;
       for(int i=0;i<str.length();i++){
        char Ch=str.charAt(i);
        if(Ch=='A'||Ch=='E'||Ch=='O'||Ch=='I'||Ch=='U'||Ch=='a'||Ch=='e'||Ch=='o'||Ch=='i'||Ch=='u'){
           count++;
        }
       
       }
       System.out.println(count);

    }
}
