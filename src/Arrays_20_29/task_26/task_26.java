package Arrays_20_29.task_26;

import Arrays_20_29.InputArray;

/*26. В последовательности действительных чисел а1, а2, ..., аn есть только положительные и отрицательные элементы.
Вычислить произведение отрицательных элементов P1 и произведение положительных элементов Р2.
Сравнить модуль Р2 с модулем Р1 и указать, какое из произведений по модулю больше.*/
public class task_26 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        int P1 = getProductOfNegative(inputArray);
        int P2 = getProductOfPositive(inputArray);
        if (Math.abs(P1) == Math.abs(P2)) {
            System.out.println("The modulo product of negative elements P1 = " + Math.abs(P1) + " is equal the product of positive elements P2 = " + P2);
        } else {
            if (Math.abs(P1) > Math.abs(P2)) {
                System.out.println("The modulo product of negative elements P1 = " + Math.abs(P1) + " more than the product of positive elements P2 = " + P2);
            } else {
                System.out.println("The product of positive elements P2 = " + P2 + " more than the modulo product of negative elements P1 = " + Math.abs(P1));
            }
        }
    }

    public static int getProductOfNegative(int[] array) {
        int result = 1;
        for (int element : array) {
            if (element < 0) {
                result *= element;
            }
        }
        return result;
    }

    public static int getProductOfPositive(int[] array) {
        int result = 1;
        for (int element : array) {
            if (element > 0) {
                result *= element;
            }
        }
        return result;
    }
}