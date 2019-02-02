package Arrays_20_29.task_28;

import Arrays_20_29.InputArray;

import java.util.Arrays;
import java.util.Scanner;

/*28. Дана последовательность действительных чисел a1 ≤ a2 ≤ ... ≤ аn.
Вставить действительное число b в нее так, чтобы последовательность осталась неубывающей.*/
public class task_28 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        Scanner in = new Scanner(System.in);
        System.out.println("Input number b :");
        int b = in.nextInt();
        System.out.println("The result of insertion in non-decreasing sequence :" + Arrays.toString(getNewArray(inputArray, b)));
    }

    public static int[] getNewArray(int[] array, int target) {
        int n = array.length;
        int[] newArray = new int[n + 1];
        int j = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (target > array[i]) {
                newArray[j] = array[i];
                j++;
                index++;
            } else {
                newArray[j] = target;
                for (int k=i; k < n;k++) {
                    j++;
                    newArray[j] = array[k];
                }
                break;
            }
        }
        // дошли до конца последовательности, число b больше всех элементов
        if (index == n) newArray[j] = target;
        return newArray;
    }
}