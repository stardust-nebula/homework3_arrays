public class Task5 {
    public static void main(String[] args) {

        int[] array = {6,20,6,8, 33,19, 58};
        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        for (int i = 1; i < array.length; i++){
            if (i % 2 != 0){
                array[i] =0;
            }
        }

        System.out.println('\n' + "Измененный массив: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
