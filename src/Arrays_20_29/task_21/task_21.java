package Arrays_20_29.task_21;

import Arrays_20_29.InputArray;

import java.util.Scanner;

/*21. Дана последовательность действительных чисел a1, a2, ..., аn.
Указать те ее элементы, которые принадлежат отрезку [с, d].*/
public class task_21 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        float[] inputArray = getArray(n);
        Scanner in = new Scanner(System.in);
        System.out.println("Input the segment [с, d] :");
        float c = in.nextFloat();
        float d = in.nextFloat();
        System.out.println("The elements of sequence that belong to the segment [" + c + ", " + d + "] :");
        for (int i = 0; i < inputArray.length; i++) {
            if ((inputArray[i] >= c) && (inputArray[i] <= d)) {
                System.out.print(inputArray[i] + " ");
            }
        }
    }

    public static float[] getArray(int n) {
        Scanner in = new Scanner(System.in);
        float[] inputArray = new float[n];
        System.out.println("Input the numbers of sequence:");
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = in.nextFloat();
        }
        return inputArray;
    }
}