// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double circleAarea = new Circle(2).getArea();
        double squareAarea = new Square(2).getArea();
        double triangleAarea = new Triangle(2,2,2).getArea();

        //totalArea sumArea = new totalArea(circleAarea,squareAarea,triangleAarea);
        totalArea sumArea = new totalArea();
        sumArea.getAllArea(circleAarea,squareAarea,triangleAarea);
    }
}