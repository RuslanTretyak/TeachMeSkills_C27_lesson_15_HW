package task3;

public class Validator {
    public static boolean checkInput(String inputString) {
        int collectionSize;
        try {
            collectionSize = Integer.parseInt(inputString);
            if (collectionSize > 0) {
                return true;
            } else {
                System.out.println("некорректный ввод: вводимое число должно быть более 0");
            }
        } catch (NumberFormatException e) {
            System.out.println("некорректный ввод: должно быть целое число");
        }
        return false;
    }
}
