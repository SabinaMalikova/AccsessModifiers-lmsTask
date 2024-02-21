import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Circle circle = new Circle();
        circle.setPi(3.14);
        System.out.println("Введите радиус: ");
        circle.setRadius(scanner.nextDouble());
        System.out.println("Значение пи равен: " + circle.getPi() + " см");
        Circle.getArea(circle.getPi(), circle.getRadius());
        Circle.getcircumference(circle.getPi(), circle.getRadius());
    }
}