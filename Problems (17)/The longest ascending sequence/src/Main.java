//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        for(int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int asc = 1;
//        int ascMax = 1;
//
//        for (int i = 0; i < (arr.length - 1); i++) {
//            if (arr[i + 1] > arr[i]) {
//                asc++;
//            }
//            else asc = 1;
//            if (asc > ascMax) {
//                ascMax = asc;
//            }
//        }
//        System.out.println(ascMax);
//
//    }
//}


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = 1;
        for (int i = 1; i < n; i++) {
            int best = 1;
            while (i < n && arr[i] > arr[i - 1]) {
                best++;
                i++;
            }
            max = Math.max(max, best);
        }

        System.out.println(max);
    }
}