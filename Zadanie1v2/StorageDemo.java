package lab4.Zadanie1v2;

public class StorageDemo {

    public static <T> void showValue(Storage<T> storage, T alternative) {
        T v = storage.get(alternative);
        System.out.println("Извлечённое значение: " + v);
    }
}