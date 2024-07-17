
public class Dupli {
    public static void main(String[] args) {
// int arr[]={1,2,2,3,4,5};
String arr[]={"ABC","ABC","EFG","EFG"};
for(int i=0;i<arr.length;i++)
{
    for(int j=i+1;j<arr.length;j++)
    {
            if(arr[i]==arr[j])
            {
                System.out.println("Dupl element is: "+arr[i]);
            }   
    }


}
}}