package Arrays_20_29.task_24;

import Arrays_20_29.InputArray;

import java.util.Arrays;

/*24. Даны действительные числа a1, a2, ..., аn. Среди них есть положительные и отрицательные.
Заменить нулями те числа, величина которых по модулю больше максимального числа (|ai| > max{a1, a2, ..., аn}).*/
public class task_24 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        getReplaceWithZeros(inputArray, getMaximum(inputArray));
        System.out.println("Replacement result :" + Arrays.toString(inputArray));
    }

    public static int getMaximum(int[] array) {
        int max = array[0];
        for (int element : array) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }

    public static void getReplaceWithZeros(int[] elements, int target) {
        for (int i = 0; i < elements.length; i++) {
            if (Math.abs(elements[i]) > target) {
                elements[i] = 0;
            }
        }
    }
}