import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + (int) (Math.random() * (99 - 10) + 1);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                if (array[i - 1] >= array[i]) {
                    System.out.println("This is a regular array!");
                    break;
                } else
                    System.out.println("The array in a strictly increasing sequence!");
            }
        }
    }
}
