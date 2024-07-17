import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ANR {
    public static void main(String[] args) {
        method4();
    }

//swap two int w/o 3rd variable

public static void method1(){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of a: ");
int a=sc.nextInt(); //10
System.out.println("Enter the value of b: ");
int b=sc.nextInt(); //8
System.out.println("The value of a and b before swap are: "+ a+" "+b);

    a=a-b;//10-8
    b=a+b;//2+8
    a=b-a;
System.out.println("The value of a and b after swap are: "+ a+" "+b);
}
//Reverse String

public static void method2(){
Scanner sc=new Scanner(System.in);
String str=sc.next();
String rev=" ";
for(int i=str.length()-1;i>=0;i--){
    rev=rev+str.charAt(i);
}
System.out.println(rev);

}
//Print line by line from .txt file 
public static void method3() {
        try {
            // Provide the path to your file here
            FileReader r = new FileReader("/home/satyam/Downloads/Hello.txt");
            int i = r.read();
            while (i >0) { // Read until the end of the file
                System.out.print((char) i);
                i = r.read();
            }
            r.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void method4() {
        try{
            FileWriter f= new FileWriter("/home/satyam/Downloads/Jyoti.txt");
try{
  f.write("Hello Horld");

}
finally{
    f.close();
}

        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

}