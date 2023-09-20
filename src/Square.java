public class Square implements Figure {

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        double area = side * side;
        return area;
    }
}
