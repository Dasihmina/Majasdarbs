import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int x, y;
        System.out.println("x: ");
        x = number.nextInt();
        System.out.println("y: ");
        y = number.nextInt();

        System.out.println("+,-,*,/: ");
        String choice = number.next();

        double result = 0;


        switch (choice) {
            case "+":
                System.out.println("+");
                result = sum(x, y);
                break;
            case "-":
                System.out.println("-");
                result = sub(x, y);
                break;
            case "*":
                System.out.println("*");
                result = multi(x, y);
                break;
            case "/":
                System.out.println("/");
                result = div(x, y);
                break;
            default:
                System.out.println("Wrong");
                break;
        }
        System.out.println("= " + result);
    }

    public static int sum(int x, int y) {
        return x + y;
    }
    public static double div(double x, double y) {
        return x / y;
    }
    public static int sub(int x, int y) {
        return x - y;
    }
    public static int multi(int x, int y) {
        return x * y;
    }
}