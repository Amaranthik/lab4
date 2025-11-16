package lab4.Zadanie1v1;

public class Box<T> {

    private T value;

    public Box() {
        this.value = null;
    }

    public boolean isFull() {
        return value != null;
    }

    public void put(T newValue) {
        if (isFull()) {
            throw new IllegalStateException("Коробка уже заполнена!");
        }
        this.value = newValue;
    }

    public T get() {
        T temp = value;
        value = null;
        return temp;
    }

    @Override
    public String toString() {
        return isFull() ? ("Коробка содержит: " + value)
                : "Коробка пустая";
    }
}