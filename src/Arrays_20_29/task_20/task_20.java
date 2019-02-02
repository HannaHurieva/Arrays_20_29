package Arrays_20_29;

import Arrays_20_29.InputArray;

//20. Дан одномерный массив A[N]. Найти:  mаx(а2, а4, ..., a2k) + min(а1, а3, …, a2k-1).
// * где а1 - первый эдемент массива с индексом 0
public class task_20 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        int sum = getMaximumOfOdd(inputArray) + getMinimumOfEven(inputArray);
        System.out.println("mаx(а2, а4, ..., a2k) + min(а1, а3, …, a2k-1) = " + sum);
    }

    public static int getMaximumOfOdd(int[] elements) {
        int max = elements[1];
        for (int i = 1; i < elements.length; i += 2) {
            if (max < elements[i]) {
                max = elements[i];
            }
        }
        return max;
    }

    public static int getMinimumOfEven(int[] elements) {
        int min = elements[0];
        for (int i = 0; i < elements.length; i += 2) {
            if (min > elements[i]) {
                min = elements[i];
            }
        }
        return min;
    }
}