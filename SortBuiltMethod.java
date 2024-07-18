import java.util.Arrays;
import java.util.Collections;

public class SortBuiltMethod {
    public static void main(String[] args) {
Integer a[]= {7,2,1,0,8,4};
// Arrays.sort(a);
Arrays.parallelSort(a);
Arrays.sort(a,Collections.reverseOrder()j);
System.out.println("SOrted Arrays are: "+ Arrays.toString(a));
    }
}