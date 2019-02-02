package Arrays_20_29.task_29;

import Arrays_20_29.InputArray;

import java.util.Scanner;

/*29. Даны целые положительные числа а1, а2, ..., an.
Найти среди них те, которые являются квадратами некоторого числа m.*/
public class task_29 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number M :");
        int M = in.nextInt();
        int find = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == M*M) {
                find++;
                if (find == 1) System.out.println("The numbers of sequence which are squares of number M :");
                if (find > 1) System.out.print(", ");
                System.out.print(inputArray[i]);
            }
        }
    }
}