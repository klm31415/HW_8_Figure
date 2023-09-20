public class totalArea implements allArea {

    @Override
    public void getAllArea(double area1, double area2, double area3) {
        double sumArea = area1+area2+area3;
        System.out.println("Общая площадь "+sumArea);
        //return sumArea;
    }

    @Override
    public void getAllArea() {

    }
}
