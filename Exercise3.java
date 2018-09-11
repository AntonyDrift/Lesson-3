public class Main {

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 7, 5};
        int indexMin = 0;
        int indexMax = 0;
        int min = array[0];
        int max = array[0];
        int sum = 0;

        System.out.println("My array:");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        if (min < max) {
            for (int i = indexMin + 1; i < indexMax; i++) {
                sum += array[i];
            }
        } else if (min > max) {
            for (int i = indexMax + 1; i < indexMin; i++) {
                sum += array[i];
            }
        }
        System.out.println("The sum between the minimum and maximum values: " + sum);
    }
}
