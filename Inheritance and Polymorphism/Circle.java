class Circle extends Shape {
    private double radius;
    private static final double PI = 3.14;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Circle Area: " + calculateArea());
    }
}
