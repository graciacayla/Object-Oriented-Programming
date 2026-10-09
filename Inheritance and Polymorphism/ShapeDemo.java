public class ShapeDemo {
    public static void main(String[] args) {
       
        System.out.println("SQUARE");
        Square kubus = new Square(15.0, "Purple");
        kubus.printInfo();
        System.out.println();

        System.out.println("CIRCLE");
        Circle lingkaran = new Circle(7.0, "Yellow");
        lingkaran.printInfo();
        System.out.println();

        System.out.println("CYLINDER");
        Cylinder silinder = new Cylinder(14.0, 20.0, "Blue");
        silinder.printInfo();
    }

}
