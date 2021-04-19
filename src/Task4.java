import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int setLength = 0;

        while (setLength < 6 || setLength > 10){
            System.out.println("Введите размер массива: ");
            setLength = sc.nextInt();
        }

        int[] array = new int[setLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
            System.out.print(array[i] + " ");
        }

        int count = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                count -= 1;
            }
        }

        if (count == array.length) {
            System.out.println('\n' + "Нет четных чисел в массиве.");
            return;
        }

        int[] array2 = new int[count];
        System.out.println('\n' + " Длина нового массива = " + count);
        System.out.print('\n' + "Новый массив: ");

        int j = 0;
        for (int i = 0; i < array2.length; i++){
            while (j < array.length) {
                if (array[j] % 2 == 0) {
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
