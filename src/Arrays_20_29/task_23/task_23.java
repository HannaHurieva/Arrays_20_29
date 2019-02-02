package Arrays_20_29.task_23;

import Arrays_20_29.InputArray;

import java.util.Arrays;

/*23. Последовательность a1, a2, ..., аn состоит из нулей и единиц.
Поставить в начало этой последовательности нули, а затем единицы.*/
public class task_23 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        sort(inputArray);
        System.out.println("The sorted sequence : " + Arrays.toString(inputArray));
    }

    public static void sort(int[] array) {
        for (int i = array.length - 1; i > 1; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
    }
}