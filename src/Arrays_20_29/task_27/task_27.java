package Arrays_20_29.task_27;

import Arrays_20_29.InputArray;

import java.util.Arrays;

/*27. Дан массив действительных чисел. Среди них есть равные.
Найти первый максимальный элемент массива и заменить его нулем.*/
public class task_27 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        getMaximumReplacedByZero(inputArray);
        System.out.println("Replacement result :" + Arrays.toString(inputArray));
    }

    public static void getMaximumReplacedByZero(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        array[index] = 0;
    }
}