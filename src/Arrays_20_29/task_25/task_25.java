package Arrays_20_29.task_25;

import Arrays_20_29.InputArray;

/*25. Даны действительные числа а1, а2, ..., аn.
Найти  max(a1 + a2n, a2 + a2n-1, ..., аn + an+1).*/
public class task_25 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        int result = getMaximumOfSum(inputArray);
        System.out.println("max(a1 + a2n, a2 + a2n-1, ..., аn + an+1) = " + result);
    }

    public static int getMaximumOfSum(int[] array) {
        int n = array.length;
        int middle = n / 2;
        int max = array[0];
        for (int i = 0; i < middle; i++) {
            if (max < (array[i] + array[n - 1 - i])) {
                max = array[i] + array[n - 1 - i];
            }
        }
        // если n - длина массива нечетное число
        if (n % 2 == 1) {
            if (max < array[middle]) max = array[middle];
        }
        return max;
    }
}