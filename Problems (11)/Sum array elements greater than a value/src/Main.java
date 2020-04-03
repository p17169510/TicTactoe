import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int sum = 0;

        for (int i : arr) {
            if (i > num) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}