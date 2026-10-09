class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double calculateVolume() {
        return calculateArea() * height;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Cylinder Volume: " + calculateVolume());
    }
}
