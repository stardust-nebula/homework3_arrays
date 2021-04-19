import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int setLength = sc.nextInt();

        double[] array = new double[setLength];
        for (int i = 0; i < array.length; i++){
            array[i] = Math.random();
            System.out.println(i + ": " + array[i] + " ");
        }
    }
}
