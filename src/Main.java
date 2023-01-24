import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    //Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке,
    // числа - в убывающем.
    //
    //Пример ввода:
    //Вишня
    //1
    //Боб
    //3
    //Яблоко
    //2
    //0
    //Арбуз
    //
    //Пример вывода:
    //Арбуз
    //3
    //Боб
    //2
    //Вишня
    //1
    //0
    //Яблоко
    public static void main(String[] args) {
        twoList();
    }

    static void twoList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите целые цифры или слова, если ввести 555,то будет вывод:");
        List<String> list = new ArrayList<>();
        List<String> finalList = new ArrayList<>();
        List<Integer> intlist = new ArrayList<>();
        String a = "";


        while (!a.equalsIgnoreCase("555")) {
            a = scanner.next();
            list.add(a);
        }

        for (int i = 0; i < list.size(); i++) {
            try {
                intlist.add(Integer.parseInt(list.get(i)));
            } catch (Exception ex) {
                finalList.add(list.get(i));
            }
        }

        Collections.sort(finalList);
        Collections.sort(intlist);
        Collections.reverse(intlist);
        int minLenght = 0;
        int maxLenght = 0;

        if (finalList.size() >= intlist.size()) {
            minLenght = intlist.size();
            maxLenght = finalList.size();
        } else if (finalList.size() < intlist.size()) {
            minLenght = finalList.size();
            maxLenght = intlist.size();
        }

        for (int i = 0; i < minLenght; i++) {
            System.out.println(finalList.get(i) + "\n" + intlist.get(i));
        }

        for (int i = minLenght; i < maxLenght; i++) {
            if (maxLenght == finalList.size()) {
                System.out.println(finalList.get(i));
            } else {
                System.out.println(intlist.get(i));
            }
        }
    }
}