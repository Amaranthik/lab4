package lab4;

import lab4.Zadanie1v1.Box;
import lab4.Zadanie1v1.BoxDemo;
import lab4.Zadanie1v2.Storage;
import lab4.Zadanie1v2.StorageDemo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        demonstrateBox();
        demonstrateStorage();
    }

    public static void demonstrateBox() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nЗадание 1.1: Обобщенная коробка");

        int number;

        while (true) {
            System.out.print("Введите целое число, которое хотите положить в коробку: ");
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                break;
            } else {
                System.out.println("Ошибка: введите ЧИСЛО!");
                sc.next();
            }
        }
        Box<Integer> intBox = new Box<>();

        try {
            intBox.put(number);
        } catch (Exception e) {
            System.out.println("Ошибка помещения в коробку: " + e.getMessage());
        }

        System.out.println(intBox);

        System.out.println("\nПередаём коробку в метод...");
        BoxDemo.showBoxValue(intBox);

        System.out.println("\nСостояние коробки после извлечения:");
        System.out.println(intBox);
    }

    public static void demonstrateStorage() {
        System.out.println("\nЗадание 1.2: Хранилище без null");

        // Число null → альтернатива 0
        Storage<Integer> numberNull = new Storage<>(null);
        StorageDemo.showValue(numberNull, 0);

        // Число 99 → альтернатива -1
        Storage<Integer> number99 = new Storage<>(99);
        StorageDemo.showValue(number99, -1);

        // Строка null → альтернатива "default"
        Storage<String> stringNull = new Storage<>(null);
        StorageDemo.showValue(stringNull, "default");

        // Строка "hello" → альтернатива "hello world"
        Storage<String> stringHello = new Storage<>("hello");
        StorageDemo.showValue(stringHello, "hello world");
    }
}