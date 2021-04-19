import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        String[] names = {"Tom", "Max", "Linda", "James", "Lora", "Hannah"};
        for (int i = 0; i < names.length; i++){
            System.out.print(names[i] + " ");
        }

        System.out.println('\n' + "Отсортирован");
        Arrays.sort(names);
        for (int i = 0; i < names.length; i++){
            System.out.print(names[i] + " ");
        }
    }
}
