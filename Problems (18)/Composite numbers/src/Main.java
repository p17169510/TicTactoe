import java.util.Scanner;

public class Main {
//
//    public static boolean isComposite(long number) {
//        boolean comp = false;
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) {
//                comp = true;
//                break;
//            }
//        }
//        return comp;
//    }

    /* Do not change code below */
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        final long number = scanner.nextLong();
//        System.out.println(isComposite(number));

        int[][][] cubic = new int[3][4][5]; // an three-dimensiona array (cube)

        int current = 1; // it stores a value to fill elements

        for (int i = 0; i < 3; i++) { // iterating through each 2D array ("table" or "matrix")
            for (int j = 0; j < 4; j++) { // iterating through each 1D array ("vector") array of a "matrix"
                for (int k = 0; k < 5; k++) { // iterating through each element of a vector
                    cubic[i][j][k] = current; // assign a value to an element
                }
            }
            current++; // get the next value to the next "matrix"
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(cubic[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}