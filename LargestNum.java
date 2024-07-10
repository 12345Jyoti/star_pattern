public class LargestNum {
    public static void main(String[] args) {
        int number[]={8,7,3,5,6,4};
        int max=number[0]; 
        for(int i=0;i<number.length;i++){
                if(number[i]>max){
                    max=number[i];
            }
        }
        System.out.println(max);
    }
}