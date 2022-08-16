import java.util.Arrays;

public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        //Task 1
        System.out.println();

        int myArray[] = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

        //Task 2
        System.out.println();

        int[] spending = generateRandomArray();
        int min = Arrays.stream(spending).min().getAsInt();
        int max = Arrays.stream(spending).max().getAsInt();
        System.out.println("Минимальная сумма трат за день составила  " + min + "  рублей");
        System.out.println("Максимальная  сумма трат за день составила  " + max + "  рублей ");


        //Task 3
        System.out.println();
        System.out.println();

        double average = 0;
        int summ = 0;
        for (int k = 0; k < myArray.length; k++) {
            summ = summ + myArray[k];
            average = summ / 30;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //Task 4
        System.out.println();
        System.out.println();

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] fullName = new char[reverseFullName.length];
        for (char i = 0; i < reverseFullName.length; i++) {
            fullName[reverseFullName.length - 1 - i] = reverseFullName[i];
        }
        reverseFullName = fullName;
        System.out.println(reverseFullName);

    }
}