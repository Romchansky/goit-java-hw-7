import figure.*;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle("Circle");
        Shape pentagon = new Pentagon("Pentagon");
        Shape quad = new Quad("Quad");
        Shape trapezium = new Trapezium("Trapezium");
        Shape triangle = new Triangle("Triangle");

        System.out.println(circle.printName());
        System.out.println(pentagon.printName());
        System.out.println(quad.printName());
        System.out.println(trapezium.printName());
        System.out.println(triangle.printName());

    }
}
