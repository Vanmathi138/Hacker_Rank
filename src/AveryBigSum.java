import java.util.*;

public class AveryBigSum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Array size limit: ");
        int arraySize = scan.nextInt();

        List<Long> list = new ArrayList<>();
        System.out.println("Enter the long numbers: ");
        for(int i=0;i<arraySize;i++){
            long s = scan.nextLong();
            list.add(s);
        }
        System.out.println(list);
        long sumArray = addLongArray(list);
        System.out.println(sumArray);
    }

    private static long addLongArray(List<Long> list) {
        Long sum=0L;
        for(Long l : list){
            sum+=l;
        }
        return sum;
    }
}
