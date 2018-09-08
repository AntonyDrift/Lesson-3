public class Main {

    public static void main(String[] args) {
        int simple = 9;
        int i;
        for (i = 2; i < simple; i++) {
            if (simple % i == 0) {
                System.out.println("This number is not simple");
                return;
            }
        }
        System.out.println("This number is simple");
    }
}


