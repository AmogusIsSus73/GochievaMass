import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10); // Генерируем случайное число от 0 до 9
        }

        System.out.print("Массив случайных чисел: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        int evenCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Количество четных элементов в массиве: " + evenCount);
    }
}
