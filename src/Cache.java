import java.util.HashMap;
import java.util.Map;

public class Cache<T> {
    private Map<String, T> cache = new HashMap<>();

    public void add(String key, T value) {
        cache.put(key, value);
    }

    public T get(String key) {
        return cache.get(key);
    }

    public void clear() {
        cache.clear();
    }

    public static <T> void addAll(Cache<? super T> target, Cache<T> source) {
        for (Map.Entry<String, T> entry : source.cache.entrySet()) {
            target.add(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public String toString() {
        return cache.toString();
    }
}

