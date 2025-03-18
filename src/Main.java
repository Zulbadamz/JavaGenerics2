import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Pair Class:");
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        System.out.println(pair);

        System.out.println("\nTesting Stack Class:");
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("Stack: " + stack);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack: " + stack);

        System.out.println("\nTesting Generic Sort Utility:");
        ArrayList<CustomClass> list = new ArrayList<>(Arrays.asList(
            new CustomClass("Alice", 30),
            new CustomClass("Bob", 25),
            new CustomClass("Charlie", 35)
        ));
        System.out.println("Before Sort: " + list);
        GenericUtils.sort(list);
        System.out.println("After Sort: " + list);

        System.out.println("\nTesting Cache:");
        Cache<String> cache = new Cache<>();
        cache.add("1", "Hello");
        cache.add("2", "World");
        System.out.println("Cache: " + cache);
    }
}

