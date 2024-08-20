package Algorithms;
import java.util.*;
public class CompareTheTriplets {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int arrSize = scanner.nextInt();
        List<Integer> list1 = new ArrayList<>();
        System.out.println("Enter the numbers for list 1: ");
        for(int i=0;i<arrSize;i++){
            int a = scanner.nextInt();
            list1.add(a);
        }
        List<Integer> list2 = new ArrayList<>();
        System.out.println("Enter the numbers for list 2: ");
        for(int i=0;i<arrSize;i++){
            int a = scanner.nextInt();
            list2.add(a);
        }
        System.out.println(list1);
        System.out.println(list2);
        String compare = compareTheTriplets(list1, list2);
    }

    private  static String compareTheTriplets(List<Integer> list1, List<Integer> list2) {
        if(list1.size()==list2.size()) {
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i) > list2.get(i)) {
                    System.out.println("Alice got 1 point");
                } else if (list1.get(i) < list2.get(i)) {
                    System.out.println("Bob got 1 point");
                }
            }

        }
        return "neither of them get point";
    }
}
