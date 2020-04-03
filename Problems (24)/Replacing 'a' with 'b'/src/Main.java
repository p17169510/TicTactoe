import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String ext = "";

        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == 'a') {
                ext += 'b';
            }
            else ext += inp.charAt(i);
        }

        System.out.println(ext);
    }
}