import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + (int) (Math.random() * (99 - 10) + 1);
            System.out.println(array[i] + " ");
        }
        
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                if (array[i - 1] >= array[i]) {
                    System.out.println("false");
                    break;
                } else System.out.println("good");
            }
        }
    }
}



