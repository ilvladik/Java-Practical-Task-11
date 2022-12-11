package exercise_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tester {

    static final int COUNT_ITER = 10000;

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        long start;
        System.out.print("Добавление в arrayList: ");
        start = System.nanoTime();
        insert(arrayList);
        System.out.println(System.nanoTime()-start + " millis");

        System.out.print("Добавление в linkedList: ");
        start = System.nanoTime();
        insert(linkedList);
        System.out.println(System.nanoTime()-start + " millis");

        System.out.print("Поиск в arrayList: ");
        start = System.nanoTime();
        find(arrayList);
        System.out.println(System.nanoTime()-start + " millis");

        System.out.print("Поиск в linkedList: ");
        start = System.nanoTime();
        find(linkedList);
        System.out.println(System.nanoTime()-start + " millis");

        System.out.print("Удаление из arrayList: ");
        start = System.nanoTime();
        remove(arrayList);
        System.out.println(System.nanoTime()-start + " millis");

        System.out.print("Удаление из linkedList: ");
        start = System.nanoTime();
        remove(linkedList);
        System.out.println(System.nanoTime()-start + " millis");

    }

    public static void insert(List<Integer> list) {
        for (int i = 0; i < COUNT_ITER; i++) {
            list.add((int)(Math.random() * 100));
        }
    }

    public static boolean find(List<Integer> list) {
        return list.contains((int)(Math.random() * 100));
    }

    public static void remove(List<Integer> list) {
        list.remove((int)(Math.random() * 100));
    }
}
