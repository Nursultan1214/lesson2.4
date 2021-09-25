package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int countOfLines = scanner.nextInt();

        System.out.println("Заполните список А");
        ArrayList listA = new ArrayList();

        while (listA.size() < countOfLines) {
            listA.add(scanner.next());
        }

        printList(listA);
        System.out.println();
        System.out.println("Заполните список B");

        ArrayList listb = new ArrayList();

        while (listb.size() < countOfLines) {
            listb.add(scanner.next());
        }
        printList(listb);

        Collections.reverse(listb);
        ArrayList listC = new ArrayList();

        int index = 0;

        while (listC.size() < listA.size() + listb.size()){
            listC.add(listA.get(index));
            listC.add(listb.get(index));
            index++;
        }
        System.out.println();
        printList(listC);
        listC.sort(Comparator.comparing(String::length));
        System.out.println(listC);



    }

    static void printList(ArrayList list) {
        Iterator iterator = list.iterator();


        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}
//#ДЗ 4-й урок
//a)
//e)  Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
//f)  После объединения отобразить в консоли список С
//g)   В конце отсортировать элементы списка С по длине слова, сначала идут String-и с наименьшим количеством символов,
// и распечатать отсортированный список С.