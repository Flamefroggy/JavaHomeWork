
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите положительное число: ");
        int number = sc.nextInt();
        sc.close();

        int trgsum = 0;
        int factorial = 1;
        for (int i = 1; i < number + 1; i++) {
            trgsum += i;
            factorial *= i;
        }
        System.out.printf("Треугольное число %d (сумма чисел от 1 до %d) = %d\n", number, number, trgsum);
        System.out.printf("Факториал числа %d (произведение чисел от 1 до %d) = %d\n", number, number, factorial);

    }
}