package homework4;
import java.util.*;

public class task {
    public static void main(String[] args) {
        // Создаем два Deque
        Deque<Integer> deque1 = new LinkedList<>();
        Deque<Integer> deque2 = new LinkedList<>();

        // Заполняем Deque числами в обратном порядке
        deque1.add(1);
        deque1.addFirst(2);
        deque1.addFirst(3);

        deque2.add(4);
        deque2.addFirst(5);
        deque2.addFirst(6);

        
        // Выбираем команду
        Scanner scanner = new Scanner(System.in);
        System.out.println(deque1);
        System.out.println(deque2);
        System.out.println("Выберите команду: 1 - умножение, 2 - сложение");
        int command = scanner.nextInt();

        // Выполняем выбранную команду
        switch (command) {
            case 1:
                // Умножаем два числа и возвращаем произведение в виде связанного списка
                Deque<Integer> result1 = multiply(deque1, deque2);
                System.out.println("Произведение: " + result1);
                break;
                
            case 2:
                // Складываем два числа и возвращаем сумму в виде связанного списка
                Deque<Integer> result2 = add(deque1, deque2);
                System.out.println("Сумма: " + result2);
                break;
            default:
                System.out.println("Неверная команда");
        }
    }

    // Метод для умножения двух чисел в виде связанных списков
    public static Deque<Integer> multiply(Deque<Integer> deque1, Deque<Integer> deque2) {
        // Преобразуем Deque в число
        int num1 = dequeToNum(deque1);
        int num2 = dequeToNum(deque2);

        // Вычисляем произведение
        int product = num1 * num2;

        // Преобразуем произведение в связанный список
        return numToDeque(product);
    }

    // Метод для сложения двух чисел в виде связанных списков
    public static Deque<Integer> add(Deque<Integer> deque1, Deque<Integer> deque2) {
        // Преобразуем Deque в число
        int num1 = dequeToNum(deque1);
        int num2 = dequeToNum(deque2);

        // Вычисляем сумму
        int sum = num1 + num2;

        // Преобразуем сумму в связанный список
        return numToDeque(sum);
    }

    // Метод для преобразования связанного списка в число
    public static int dequeToNum(Deque<Integer> deque) {
        int num = 0;
        int multiplier = 1;

        // Обходим связанный список и вычисляем число
        while (!deque.isEmpty()) {
            int digit = deque.removeFirst();
            num += digit * multiplier;
            multiplier *= 10;
        }

        return num;
    }

    // Метод для преобразования числа в связанный список
    public static Deque<Integer> numToDeque(int num) {
        Deque<Integer> deque = new LinkedList<>();

        // Разбиваем число на цифры и добавляем их в связанный список
        while (num > 0) {
            int digit = num % 10;
            deque.addFirst(digit);
            num /= 10;
        }

        return deque;
    }
}
