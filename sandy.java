import java.util.ArrayList;
import java.util.List;

public class sandy {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 6, 7, 8, 3};

        List<Integer> duplicates = findDuplicates(array);
        System.out.println("Duplicates: " + duplicates);
    }

    public static List<Integer> findDuplicates(int[] array) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && !duplicates.contains(array[i])) {
                    duplicates.add(array[i]);
                }
            }
        }
        return duplicates;
    }
}
