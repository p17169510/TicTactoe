//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String pretty = "YES";
//        int row = 4;
//        int col = 4;
//        char[] arr0 = sc.next().toCharArray();
//        char[] arr1 = sc.next().toCharArray();
//        char[] arr2  = sc.next().toCharArray();
//        char[] arr3  = sc.next().toCharArray();
//
//        char[][] fullarr = new char[row][col];
//        fullarr[0] = arr0;
//        fullarr[1] = arr1;
//        fullarr[2] = arr2;
//        fullarr[3] = arr3;
//
//        for (int i = 0; i < (row-1); i++) {
//            for (int j = 0; j < (col - 1); j++) {
//                if( fullarr[i][j] == fullarr[i][j+1] && fullarr[i+1][j] == fullarr[i+1][j+1] && fullarr[i][j] == fullarr[i+1][j] ) {
//                    pretty = "NO";
//                    break;
//                }
//            }
//        }
//
//        System.out.println(pretty);
//
//    }
//}


//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String[] arr = new String[4];
//        for (int i = 0; i < 4; i++) {
//            arr[i] = scanner.next();
//        }
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (arr[i].charAt(j) == arr[i + 1].charAt(j) && arr[i].charAt(j) == arr[i].charAt(j + 1)
//                        && arr[i].charAt(j) == arr[i + 1].charAt(j + 1)) {
//                    System.out.println("NO");
//                    return;
//                }
//            }
//        }
//
//        System.out.println("YES");
//    }
//}



















import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[i].charAt(j)...)
            }
        }
    }

}