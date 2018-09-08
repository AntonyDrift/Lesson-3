public class Main {

    public static void main(String[] args) {
        int n = 1;
        int result = 1;

        while ( n == 0) {
            System.out.println(result);
            break;
        }
        while (n < 0) {
            System.out.println("minus");
            break;
        }

        for (int i = 1; i <= n; i++) {
            result *= i;
            System.out.println(result);
        }
    }
}

