package task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isInputCorrect;
        String inputString;
        do {
            System.out.println("введите размер коллекции (целое число более 0)");
            inputString = scanner.next();
            isInputCorrect = Validator.checkInput(inputString);
        } while (!isInputCorrect);
        List<Integer> integerList = fillInCollection(Integer.parseInt(inputString));
        System.out.println("получены числа: " + integerList);
        printAverage(integerList);
    }
    private static List<Integer> fillInCollection(int collectionSize) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < collectionSize; i++) {
            list.add(random.nextInt(10));
        }
        return list;
    }
    private static void printAverage(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        double average = (double) sum / list.size();
        System.out.println("среднее арифметическое = " + average);
    }
}
