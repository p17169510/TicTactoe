import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//
//        int size = sc.nextInt();
//
//        int[] arr = new int[size];
//        for (int i : arr){
//            arr[i] = sc.nextInt();
//            sum += arr[i];
//        }
//
//        System.out.println(sum);
        int arrLength = sc.nextInt();
        int rot = sc.nextInt();
        int realRot = rot/arrLength;

        System.out.println(realRot);

    }
}