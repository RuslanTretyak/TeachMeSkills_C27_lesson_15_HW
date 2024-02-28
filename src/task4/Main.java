package task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Реут Андрей");
        names.add("Реут Андрей");
        names.add("Астапчик Артём");
        names.add("Астапчик Артём");
        names.add("Илькевич Алина");
        names.add("Илькевич Алина");
        names.add("Иргалиева Анастасия");
        names.add("Иргалиева Анастасия");
        names.add("Каральчук Артем");
        names.add("Каральчук Артем");
        names.add("Крайко Никита");
        names.add("Крайко Никита");
        names.add("Манеев Олег");
        names.add("Манеев Олег");
        names.add("Михновецкий Иван");
        names.add("Михновецкий Иван");
        names.add("Паляница Кирилл");
        names.add("Паляница Кирилл");
        names.add("Рябухин Руслан");
        names.add("Рябухин Руслан");
        names.add("Саркисов Евгений");
        names.add("Саркисов Евгений");
        names.add("Свинко Павел");
        names.add("Свинко Павел");
        names.add("Семенчик Руслан");
        names.add("Семенчик Руслан");
        names.add("Третяк Руслан");
        names.add("Третяк Руслан");
        names.add("Хамицкий Александр");
        names.add("Хамицкий Александр");
        names.add("Чаботько Даниил");
        names.add("Чаботько Даниил");
        names.add("Шубин Алексей");
        names.add("Шубин Алексей");
        names.add("Колос Владислав");
        names.add("Колос Владислав");
        System.out.println("исходная коллекция имен: " + names);
        createAndPrintUniqueNamesCollection(names);


    }

    private static void createAndPrintUniqueNamesCollection(List<String> listOfNames) {
        Set<String> uniqueNames = new TreeSet<>(listOfNames);
        System.out.println("коллекция уникальных имен: " + uniqueNames);
    }
}
