import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        int n = 300;
        BigInteger result = BigInteger.valueOf(1);

        while (n == 0) {
            System.out.println(result);
            break;
        }
        while (n < 0) {
            System.out.println("The number can't be negative!");
            break;
        }
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
            System.out.println(result);
        }
    }
}
