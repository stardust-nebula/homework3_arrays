public class Task7 {
    public static void main(String[] args) {

        int array[] = {9, 26, 0, -9, 84, 36, 17, 71};
        int a, b, boofer;

        System.out.print("Массив до сортировки:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }

        for (a = 1; a < array.length; a++)
            for (b = array.length - 1; b >= a; b--) {
                if (array[b - 1] > array[b]) {
                    boofer = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = boofer;
                }
            }

        System.out.print('\n' + "Массив после сортировки: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
