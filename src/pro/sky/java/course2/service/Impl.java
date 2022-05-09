package pro.sky.java.course2.service;

import java.util.*;

public class Impl implements Service {
    List<Integer> nums = new ArrayList<>(List.of(1, 4, 4, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    List<String> letters = new ArrayList<>(List.of("a", "b", "b", "c", "d", "b"));

    @Override
    public void odd() {
        for (Integer aum : nums) {
            if (aum % 2 != 0) {
                System.out.print(aum + " ");
            }
        }
        System.out.println();
    }

    @Override
    public void even() {
        HashSet<Integer> nums = new HashSet<>(Set.copyOf(this.nums));
        Collections.sort(this.nums);
        for (Integer anotherNum : nums) {
            if (anotherNum % 2 == 0) {
                System.out.print(anotherNum + " ");
            }
        }
        System.out.println();
    }

    @Override
    public void uniqueLetters() {
        HashSet<String> uniqueLetters = new HashSet<>(Set.copyOf(letters));
        System.out.println(uniqueLetters);
    }

    @Override
    public void duplicateLettersNumber() {
        HashSet<String> uniqueLetters = new HashSet<>(Set.copyOf(letters));
        System.out.println(letters.size() - uniqueLetters.size());
    }
}