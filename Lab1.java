import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть x: ");
        double x = scanner.nextDouble();

        double y = 1.2;
        double d = 3.0;

        double R = (Math.pow(Math.cos(y), 3) + Math.pow(2, x) * d)
                / (Math.exp(y) + Math.log(Math.pow(Math.sin(x), 2) + 7.4));

        System.out.println("R = " + R);

        scanner.close();
    }
}