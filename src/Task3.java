public class Task3 {
    public static void main(String[] args) {


        int[] array1 = new int[5];
        int[] array2 = new int[5];

        System.out.print("Массав №1: ");
        for (int i = 0; i < array1.length; i++){
            array1[i] = (int) (Math.random() * 10);
            System.out.print(array1[i] + " ");
        }

        System.out.print('\n' + "Массав №2: ");
        for (int i = 0; i < array2.length; i++){
            array2[i] = (int) (Math.random() * 10);
            System.out.print(array2[i] + " ");
        }


        int sumArray1 = 0;
        int sumArray2 = 0;

        for (int i = 0; i < array1.length; i++){
            sumArray1 += array1[i];
        }

        for (int i = 0; i < array2.length; i++){
            sumArray2 += array2[i];
        }

        double avrArray1 = (double)sumArray1 / array1.length;
        System.out.println('\n' + "Среднее арифметическое массива1 = " + avrArray1);

        double avrArray2 = (double)sumArray2 / array2.length;
        System.out.println("Среднее арифметическое массива2 = " + avrArray2);

        if (avrArray1 > avrArray2){
            System.out.println("Среднее арифметическое массива1 больше.");
        } else if (avrArray1 < avrArray2){
            System.out.println("Среднее арифметическое массива2 больше.");
        }else System.out.println("Среднее арифметическое массива1 и массива 2 равны.");

    }
}
