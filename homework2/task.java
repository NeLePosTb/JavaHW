package homework2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class task {
    public static void main(String[] args) {
        List<Integer> numbers = generateNumbers();
        System.out.println("Список чисел: " + numbers);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите команду: ");
        System.out.println("1 - удалить нечетные числа и формировать новый список");
        System.out.println("2 - найти минимальное число и вывести его");
        System.out.println("3 - найти максимальное число и вывести его");
        System.out.println("4 - найти среднее арифметическое и вывести его");
        int command = scanner.nextInt();

        switch (command) {
            case 1:
                List<Integer> evenNumbers = removeOddNumbers(numbers);
                System.out.println("Список четных чисел: " + evenNumbers);
                break;
            case 2:
                int minNumber = findMinNumber(numbers);
                System.out.println("Минимальное число: " + minNumber);
                break;
            case 3:
                int maxNumber = findMaxNumber(numbers);
                System.out.println("Максимальное число: " + maxNumber);
                break;
            case 4:
                double average = findAverage(numbers);
                System.out.println("Среднее арифметическое: " + average);
                break;
            default:
                System.out.println("Неверная команда");
        }

    }

    private static List<Integer> generateNumbers() {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(100);
            numbers.add(number);
        }
        return numbers;
    }

    private static List<Integer> removeOddNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    private static int findMinNumber(List<Integer> numbers) {
        return Collections.min(numbers);
    }

    private static int findMaxNumber(List<Integer> numbers) {
        return Collections.max(numbers);
    }

    private static double findAverage(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }
}
