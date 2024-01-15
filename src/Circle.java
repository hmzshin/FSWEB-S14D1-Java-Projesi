public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            System.out.println("Radius can not be equal or smaller then zero, Default value is 0.01");
            this.radius = 0.01;
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
