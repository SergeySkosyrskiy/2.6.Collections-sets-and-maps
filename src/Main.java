import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num);
            }
        }
        System.out.println();
    }

    public static void task2() {

        List<Integer> nums = new ArrayList<>(List.of(6, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(nums);
        int min = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (num % 2 == 0 && num != min) {
                System.out.print(num);
                min = num;
            }
        }
        System.out.println();
    }

    public static void task3() {
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три","два","два","два","два"));
        Set<String> stringHashSet = new HashSet<>(strings);
        System.out.println(stringHashSet);
//        System.out.println();
    }

    public static void task4() {
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три","два","два"));
        Set<String> stringHashSet = new HashSet<>(strings);
        System.out.println(strings.size() - stringHashSet.size());

    }

}
