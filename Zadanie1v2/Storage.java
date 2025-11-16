package lab4.Zadanie1v2;

public class Storage<T> {
    private final T value;

    public Storage(T value) {
        this.value = value;
    }

    public T get(T alternative) {
        return value != null ? value : alternative;
    }

    @Override
    public String toString() {
        return value != null ? "Хранилище содержит: " + value : "Хранилище пустое (null)";
    }
}