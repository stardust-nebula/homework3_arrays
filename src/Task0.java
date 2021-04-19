import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {

        int[] array = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = sc.nextInt();

        System.out.println("Массив: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
            System.out.print(array[i] + " ");
        }

        System.out.print('\n' + "Число " + number);
        boolean numberExist = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                numberExist = true;
                System.out.println(" присутствует в массиве");
                break;
            }
        }
        if (numberExist == false) {
            System.out.println(" не присутствует");
        }
    }
}
