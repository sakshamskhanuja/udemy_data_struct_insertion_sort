public class Main {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        // Prints contents of unsorted array.
        printContents(array);

        // Stores the value of the current index.
        int currentValue;

        // Stores the index which is 1 less than the currentValue index.\
        int previousIndex;

        for (int i = 1; i < array.length; i++) {
            // Updating the current value.
            currentValue = array[i];

            // Updating the previous index;
            previousIndex = i - 1;

            // While previousIndex is greater than 0 and previous value is greater than current value.
            while (previousIndex >= 0 && array[previousIndex] > currentValue) {
                array[previousIndex + 1] = array[previousIndex];
                previousIndex--;
            }
            array[previousIndex + 1] = currentValue;
        }

        // Prints contents of sorted array.
        printContents(array);
    }

    /**
     * Prints contents of an array.
     *
     * @param array Integer array.
     */
    public static void printContents(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
