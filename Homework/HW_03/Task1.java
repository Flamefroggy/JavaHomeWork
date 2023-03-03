package Homework.HW_03;
import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        createRandomListInt(myList, 10, 10);
        showList(myList);
        removeEven(myList);
        showList(myList);
    }

    // удаляем целые числа из списка
    private static void removeEven(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
    }
    // просмотр выбранного списка
    private static void showList(ArrayList<Integer> list) {
        for (Integer value : list)
            System.out.print(value + " ");

        System.out.println("");
    }
    // создаём произвольный список целых чисел
    private static void createRandomListInt(ArrayList<Integer> list, int count, int maxValue) {
        Random rand = new Random();
        for (int i = 0; i < count; i++)
            list.add(rand.nextInt(maxValue));
    }
}