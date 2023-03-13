import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number_1 = sc.nextInt();

        System.out.print("Введите операцию действия калькулятора(+, -, *, /): ");
        String operator = sc.next();

        System.out.print("Введите второе число: ");
        int number_2 = sc.nextInt();
        sc.close();
        int result = 0;
        switch (operator) {
            case "+":
                result = number_1 + number_2;
                System.out.printf("%d + %d = %d", number_1, number_2, result);
                break;
            case "-":
                result = number_1 - number_2;
                System.out.printf("%d - %d = %d", number_1, number_2, result);
                break;
            case "/":
                result = number_1 / number_2;
                System.out.printf("%d / %d = %d", number_1, number_2, result);
                break;
            case "*":
                result = number_1 * number_2;
                System.out.printf("%d * %d = %d", number_1, number_2, result);
                break;
            default:
                System.out.println("Неверно!)");
                break;
        }
    }
}