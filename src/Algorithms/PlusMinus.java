package Algorithms;

import java.io.IOException;

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        int[] arr = {1,2,-4,-3,0,3};
        Result.plusMinus(arr);
    }
}
class Result {
    public static void plusMinus(int[] arr) {
        // Write your code here
        int plus=0;
        int minus=0;
        int z =0;
        double d=0;
        double d1=0;
        double d2=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                plus++;
                d = plus/arr.length;
            }
            if(arr[i]<0){
                minus++;
                d1=minus/arr.length;

            }
            if(arr[i]==0){
                z++;
                d2=z/arr.length;
            }
        }
        System.out.print(d+" "+d1+" "+d2);
    }

}
