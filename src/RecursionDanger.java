import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RecursionDanger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getUserInput (scanner, 1, 5);
    }
    public static int getUserInput(Scanner scanner, int min, int max) {
        System.out.println("Введите число от " + min + " до " + max);
        int result;
        try {
            result = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число");
            return getUserInput(scanner, min, max);
        }
        if(result<min || result>max) {
            System.out.printf("ы ввели число не от %d до %d \n", min, max);
            return getUserInput(scanner, min, max);
        }
        return result;
    }

    private static int [] createArray (Scanner scanner) {
        System.out.println("Введите длину");
        int length = scanner.nextInt();
        int[]array = new int[length];
        if (length == 0 || length>10) {
            System.out.println("длина массива должна быть от 0 до 10");
            array = createArray(scanner);
        }
        System.out.println("последний эллемент массива = " + array[length-1]);
        return array;
    }
}
