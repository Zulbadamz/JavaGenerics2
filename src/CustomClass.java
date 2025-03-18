public class CustomClass implements Comparable<CustomClass> {
    private String name;
    private int value;

    public CustomClass(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(CustomClass other) {
        return Integer.compare(this.value, other.value);
    }

    @Override
    public String toString() {
        return name + ": " + value;
    }
}
