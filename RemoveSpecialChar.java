public class RemoveSpecialChar {
    public static void main(String[] args) {

String str="@#$%^ J%%Y^^O&TI"  ;
str=str.replaceAll("[^A-Za-z0-9]", "");
System.out.println(str);
}
}