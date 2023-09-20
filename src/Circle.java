public class Circle implements Figure {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Pi * radius * radius;
        //System.out.println(area);
        return area;
    }

}
