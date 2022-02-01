package pl.imiajd.truchan;

import java.io.FilenameFilter;
import java.lang.reflect.Array;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>();
        characters.add('a');
        characters.add('b');
        characters.add('a');
        System.out.println(characters);
        ArrayUtil.removeRepeatedElements(characters);
        System.out.println(characters);

        ArrayList<LocalTime> localtimes = new ArrayList<>();
        localtimes.add(LocalTime.of(18, 20));
        localtimes.add(LocalTime.of(19, 25));
        localtimes.add(LocalTime.of(18, 20));
        System.out.println(localtimes);
        ArrayUtil.removeRepeatedElements(localtimes);
        System.out.println(localtimes);

        ArrayList<String> list = new ArrayList<String>();

        list.add("test");
        list.add("test2");
        list.add("test3");
        printWithSemicolon(list);
    }

    public static <E> void printWithSemicolon(Iterable<E> inter) {
        for(E element : inter) {
            System.out.print(element);
            System.out.print(";");
        }
    }
}