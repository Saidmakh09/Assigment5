import java.util.HashSet;
import java.util.Set;

public class six {
    public static void main(String[] args) {
        // Test cases
        int[] S1 = {32, 3};
        int[] T1 = {1, 2, 3, 52, 32, 54};
        System.out.println(isSubset(S1, T1) ? "Yes" : "No");

        int[] S2 = {89, 32, 54, 32, 3};
        int[] T2 = {54, 32, 99};
        System.out.println(isSubset(S2, T2) ? "Yes" : "No");

        int[] S3 = {0, 67};
        int[] T3 = {100, 5, 66, 2, 32, 90};
        System.out.println(isSubset(S3, T3) ? "Yes" : "No");

        int[] S4 = {};
        int[] T4 = {54, 32, 99};
        System.out.println(isSubset(S4, T4) ? "Yes" : "No");
    }

    private static boolean isSubset(int[] S, int[] T) {
        Set<Integer> tSet = new HashSet<>();
        for (int element : T) {
            tSet.add(element);
        }

        for (int element : S) {
            if (!tSet.contains(element)) {
                return false;
            }
        }

        return true;
    }
}
