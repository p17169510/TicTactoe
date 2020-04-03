import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean occur = true;
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == a) {
                if ( arr[i - 1] == b) {
                    occur = false;
                }
            }
            if (arr[i] == b) {
                if (arr[i - 1] == a) {
                    occur = false;
                }
            }
        }
        System.out.println(occur);

    }
}