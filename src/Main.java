public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    private static void task1() {
        int[] arr = generateRandomArray();

        // Задача 1

        int salary = 0;
        for (int a : arr) {
            salary += a;
        }
        System.out.println("Сумма трат за месяц составила " + salary);

        // Задача 2

        int min = arr [0];
        int max = arr [0];
        for (int summa : arr){
            if (summa < min){
                min = summa;
            } else if (summa > max) {
                max = summa;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");

        // Задача 3

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / (float) arr.length + " рублей");

        // Задача 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for ( int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}