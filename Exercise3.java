public class Main {

    public static void main(String[] args) {
        int block[] = {1, 2, 3, 7, 5};
        int indexMin = 0;
        int indexMax = 0;
        int min = block[0];
        int max = block[0];
        int sum = 0;
        for (int i = 0; i < block.length; i++) {
            System.out.println(block[i]);
        }
        System.out.println("...");

        for (int i = 0; i < block.length; i++) {
            if (block[i] < min) {
                min = block[i];
                indexMin = i;
            }
            if (block[i] > max) {
                max = block[i];
                indexMax = i;
            }
        }
        System.out.println(min);
        System.out.println("...");
        System.out.println(max);
        System.out.println("...");

        if (min < max) {
            for (int i = indexMin + 1; i < indexMax; i++) {
                sum += block[i];
            }
        }
         else if (min > max) {
            for (int i = indexMax + 1; i < indexMin; i++) {
                sum += block[i];
            }
        }
        System.out.println(sum);
    }
}



