import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] array = new int[size];

        for ( int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int triple = 0;
        for (int i = 2; i < array.length; i++) {
            if (array[i] - array[i - 1] == 1 && array[i] - array[i - 2] == 2) {
                    triple++;
            }
        }

        System.out.println(triple);
    }
}