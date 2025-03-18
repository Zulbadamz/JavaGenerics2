import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
    private ArrayList<T> elements = new ArrayList<>();

    public void push(T item) {
        elements.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.remove(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}


