import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = sc.nextInt();

        int[] array = new int[10];
        System.out.print("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 5;
            System.out.print(array[i] + " ");
        }

        int count = array.length;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count -= 1;
            }
        }
        if (count == array.length) {
            System.out.println('\n' + "Такого числа (" + number + ") нет в массиве.");
            return;
        }

        int[] array2 = new int[count];
        System.out.println('\n' + " Длина нового массива = " + count);
        System.out.print('\n' + "Новый массив: ");

        int j = 0;

        for (int i = 0; i < array2.length; i++) {
            while (j < array.length) {
                if (array[j] != number) {
                    array2[i] = array[j];
                    j++;
                    break;
                } else {
                    j++;
                    continue;
                }
            }

        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }


    }
}
