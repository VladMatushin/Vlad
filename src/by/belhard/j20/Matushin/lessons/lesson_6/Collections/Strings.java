package by.belhard.j20.Matushin.lessons.lesson_6.Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Strings {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(20);
        list.add(-11);
        list.add(1);
        System.out.println(list);

        list.add(1,10);

        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.get(3));
        System.out.println(list.contains(1));
        System.out.println(list.indexOf(-11));
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        list.forEach(System.out::println);
    }
}
