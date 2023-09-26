
public class DataAbstraction {

    // private data memeber
    private double radius, area, circumference;

    public void setRadius(double r) {

        radius = r;
    }

    public void computeArea() {

        area = 3.14 * radius * radius;
    }

    public void computeCircumference() {

        circumference = 2 * 3.4 * radius;
    }

    public void dataPrint() {

        System.out.println("Radius  :" + radius);
        System.out.println("Area  :" + area);
        System.out.println("Circumference  :" + circumference);
    }

}
