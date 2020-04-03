import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * The method calculates the sum of integers in a given range
     * 
     * @param from inclusive
     * @param to exclusive
     *
     * @return the sum (long)
     */
    public static long sumInRange(int from, int to) {
        long sum = 0L;
        while (from < to) {
            sum += from;
            from++;
        }
        return sum;
    }

    public static boolean isBroken (int[] array){
        boolean broken = false;
        for (int i = 1; i < array.length; i++) {
            if (array[i-1] >= array[i]){
                broken = true;
                break;
            }
        }
        return broken;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

//        int from = scanner.nextInt();
//        int to = scanner.nextInt();

        int length = scanner.nextInt();
        int [] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }


        System.out.println(Arrays.toString(arr));
        System.out.println(isBroken(arr) ? "BROKEN" : "NOT BROKEN");

//        System.out.println(sumInRange(from, to));


    } 
}