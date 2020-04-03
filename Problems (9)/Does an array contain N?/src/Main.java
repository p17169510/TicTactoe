import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cont = false;
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();

        for (int i : arr) {
            if (i == num) {
                cont = true;
                break;
            }
        }
        System.out.println(cont);
    }
}