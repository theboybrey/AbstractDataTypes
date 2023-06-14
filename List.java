public import java.util.ArrayList;

public class List<T> {
    private ArrayList<T> elements;

    public List() {
        elements = new ArrayList<>();
    }

    public void add(T item) {
        elements.add(item);
    }

    public void remove(T item) {
        elements.remove(item);
    }

    public boolean contains(T item) {
        return elements.contains(item);
    }

    public T get(int index) {
        return elements.get(index);
    }

    public int size() {
        return elements.size();
    }
} {
    
}
