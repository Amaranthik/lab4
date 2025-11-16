package lab4.Zadanie1v1;

public class BoxDemo {

    public static void showBoxValue(Box<Integer> box) {
        Integer v = box.get();
        System.out.println("Значение, извлечённое из коробки: " + v);
    }
}