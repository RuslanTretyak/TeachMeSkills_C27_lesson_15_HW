package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        System.out.println("введите число либо 'exit' для выхода");
        boolean isExit = false;
        Scanner scanner = new Scanner(System.in);
        do {
            String tempString = scanner.next();
            if (tempString.equals("exit")) {
                isExit = true;
            } else {
                try {
                    int i = Integer.parseInt(tempString);
                    integers.add(i);
                } catch (NumberFormatException e) {
                    System.out.println("некорректный ввод");
                }
            }
        } while (!isExit);
        printEvenNumbers(integers);
    }

    private static void printEvenNumbers(List<Integer> list) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                evenNumbers.add(integer);
            }
        }
        if (!evenNumbers.isEmpty()) {
            System.out.println(evenNumbers);
        } else {
            System.out.println("нет четных чисел");
        }
    }
}
