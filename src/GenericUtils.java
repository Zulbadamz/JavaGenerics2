import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericUtils {

    // Generic sort method
    public static <T extends Comparable<T>> void sort(ArrayList<T> list) {
        list.sort(null);
    }

    // Wildcard printCollection
    public static void printCollection(Collection<?> collection) {
        for (Object item : collection) {
            System.out.println(item);
        }
    }

    // Wildcard sumOfNumberList
    public static double sumOfNumberList(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }
}

