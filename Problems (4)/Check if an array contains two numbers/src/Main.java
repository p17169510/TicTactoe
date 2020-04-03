import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cont = false;
        int size = sc.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == m && i == 0) {
                if ( array[i + 1] == n) {
                    cont = true;
                }
            }
            else if (array[i] == m && i == array.length-1) {
                if ( array[i - 1] == n) {
                    cont = true;
                }
            }
            else if (array[i] == m) {
                if ( array[i - 1] == n || array[i + 1] == n) {
                    cont = true;
                }
            }
        }

        System.out.println(cont);

    }
}