public class Circle {

    private double pi;
    private double radius;


    public Circle() {

    }


    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getPi() {
        return pi;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public static void getArea(double pi, double radius) {
        double area = pi * (radius * radius);
        System.out.println("Площадь круга: " + area + " см");
    }

    public static void getcircumference(double pi, double radius) {
        double circumference = pi * 2 * radius;
        System.out.println("Длина окружности: " + circumference + " см");
    }
}
