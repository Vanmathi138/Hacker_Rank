package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(4);
        arr.add(4);
        arr.add(2);
        arr.add(4);
        arr.add(3);
        int result = solution(arr);
        System.out.println(result);
    }
    private static int solution(List<Integer> arr) {
        int max = Integer.MIN_VALUE;
        int count = 0;

        // Find the maximum height of the candles
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
                count = 1;
            } else if (arr.get(i) == max) {
                count++;
            }
        }

        return count;
    }
}
