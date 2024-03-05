public class Main2 {
    public static void main(String[] args) {
        int[] massiv = new int[50];
        int number = 1;
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = number;
            System.out.print(massiv[i] + " ");
            number = number + 2;
        }
        System.out.println();
        for (int i = 49; i >= 0; i--) {
            System.out.print(massiv[i] + " ");
        }
    }
}
