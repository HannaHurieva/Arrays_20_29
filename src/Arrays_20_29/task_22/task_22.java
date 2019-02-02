package Arrays_20_29.task_22;

import Arrays_20_29.InputArray;

import java.util.Scanner;

/*22. Дана последовательность целых положительных чисел.
Найти произведение только тех чисел, которые больше заданного числа М.
Если таких нет, то выдать сообщение об этом.*/
public class task_22 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        Scanner in = new Scanner(System.in);
        System.out.println("Input M :");
        int M = in.nextInt();
        int result = getProduct(inputArray, M);
        System.out.println("The product of only those numbers of sequence that are greater than a given number M = " + result);
    }

    public static int getProduct(int[] elements, int target) {
        int product = 1;
        int count = 0;
        for (int number : elements) {
            if (number > target) {
                product *= number;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("The sequence does not contain numbers that are greater than a given number M = " + target);
            System.exit(0);
        }
        return product;
    }
}