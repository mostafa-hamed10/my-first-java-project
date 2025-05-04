
import java.util.*;
import java.util.function.Predicate;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        Predicate<Integer> isEven = z -> z % 2 == 0;
        Predicate<Integer> isOdd = z -> z % 2 != 0;
        Predicate<Integer> isPrim = z -> {
            if (z <= 1) return false;
            for (int i = 2; i <= Math.sqrt(z); i++) {
                if (z % i == 0) return false;
            }
            return true;
        };
        Predicate<Integer> isPalind = z -> {
            String s = Integer.toString(z);
            return s.equals(new StringBuilder(s).reverse().toString());
        };

        for (int num : arr) {
            System.out.println("Number: " + num);
            if (isEven.test(num)) System.out.println("EVEN");
            if (isOdd.test(num)) System.out.println("ODD");
            if (isPalind.test(num)) System.out.println("PALINDROME");
            if (isPrim.test(num)) System.out.println("PRIME");
            System.out.println();
        }
    }
}


