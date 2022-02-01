package pl.imiajd.truchan;

import java.util.ArrayList;



public class ArrayUtil {
    public static <T extends Comparable> ArrayList removeRepeatedElements(ArrayList<T> elements) {
        for (int i = 0; i < elements.size(); i++) {
            for (int j = i + 1; j < elements.size(); j++) {
                if (elements.get(i).compareTo(elements.get(j)) != -1) {
                    elements.remove(j);
                }
            }
        }
        return elements;
    }
}