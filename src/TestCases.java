import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;

public class TestCases {

    public static void main(String[] args) {

        // ---------- Test Cases for Pair Class ----------
        System.out.println("Testing Pair Class:");
        Pair<String, Integer> pair = new Pair<>("Height", 180);
        assert pair.getKey().equals("Height") : "Key test failed";
        assert pair.getValue().equals(180) : "Value test failed";

        pair.setKey("Weight");
        pair.setValue(75);
        assert pair.getKey().equals("Weight") : "Key update failed";
        assert pair.getValue().equals(75) : "Value update failed";

        System.out.println("Pair Tests Passed!\n");

        // ---------- Test Cases for Stack Class ----------
        System.out.println("Testing Stack Class:");
        Stack<Integer> stack = new Stack<>();
        assert stack.isEmpty() : "Stack should be empty initially";

        stack.push(10);
        stack.push(20);
        assert !stack.isEmpty() : "Stack should not be empty after pushing elements";

        assert stack.pop() == 20 : "Pop failed - Expected 20";
        assert stack.pop() == 10 : "Pop failed - Expected 10";
        assert stack.isEmpty() : "Stack should be empty after popping all elements";

        // Edge Case: Pop from an empty stack
        try {
            stack.pop();
            assert false : "Expected EmptyStackException was not thrown";
        } catch (EmptyStackException e) {
            System.out.println("EmptyStackException caught as expected!");
        }

        System.out.println("Stack Tests Passed!\n");

        // ---------- Test Cases for GenericUtils (Sort Method) ----------
        System.out.println("Testing Sort Utility:");
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(5, 3, 8, 1));
        GenericUtils.sort(intList);
        assert intList.equals(Arrays.asList(1, 3, 5, 8)) : "Integer Sort failed";

        ArrayList<String> strList = new ArrayList<>(Arrays.asList("Banana", "Apple", "Cherry"));
        GenericUtils.sort(strList);
        assert strList.equals(Arrays.asList("Apple", "Banana", "Cherry")) : "String Sort failed";

        ArrayList<CustomClass> customList = new ArrayList<>(Arrays.asList(
            new CustomClass("Alice", 30),
            new CustomClass("Bob", 25),
            new CustomClass("Charlie", 35)
        ));
        GenericUtils.sort(customList);
        assert customList.get(0).getValue() == 25 : "Custom Sort failed";
        assert customList.get(2).getValue() == 35 : "Custom Sort failed";

        System.out.println("Sort Tests Passed!\n");

        // ---------- Test Cases for Wildcards ----------
        System.out.println("Testing Wildcard Methods:");
        System.out.println("Printing String Collection:");
        GenericUtils.printCollection(strList);

        System.out.println("Printing Integer Collection:");
        GenericUtils.printCollection(intList);

        ArrayList<Number> numList = new ArrayList<>(Arrays.asList(10, 20.5, 30));
        double sum = GenericUtils.sumOfNumberList(numList);
        assert sum == 60.5 : "Sum calculation failed";

        System.out.println("Wildcard Tests Passed!\n");

        // ---------- Test Cases for Cache Class ----------
        System.out.println("Testing Cache Class:");
        Cache<String> stringCache = new Cache<>();
        stringCache.add("1", "One");
        stringCache.add("2", "Two");
        assert stringCache.get("1").equals("One") : "Cache retrieval failed";

        Cache<Object> objectCache = new Cache<>();
        Cache.addAll(objectCache, stringCache);
        assert objectCache.get("1").equals("One") : "AddAll failed";

        stringCache.clear();
        assert stringCache.get("1") == null : "Clear failed";

        System.out.println("Cache Tests Passed!\n");

        System.out.println("✅ All Test Cases Passed Successfully!");
    }
}
