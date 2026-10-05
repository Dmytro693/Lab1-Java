import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть x: ");
        double x = scanner.nextDouble();

        double y = 1.2;
        double d = 3.0;

        // Перевірка ОДЗ
        double logArgument = Math.pow(Math.sin(x), 2) + 7.4;
        double denominator = Math.exp(y) + Math.log(logArgument);

        if (logArgument <= 0) {
            System.out.println("Помилка: значення x не належить області допустимих значень.");
        } else if (denominator == 0) {
            System.out.println("Помилка: знаменник дорівнює нулю.");
        } else {
            // Обчислення виразу
            double R = (Math.pow(Math.cos(y), 3) + Math.pow(2, x) * d)
                    / denominator;

            System.out.println("R = " + R);
        }

        scanner.close();
    }
}