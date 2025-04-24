public class Rectangle extends Shape{
    private int sideA=0, sideB = 0;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }



    @Override
    public double perimeter() {
        return 2*(sideB+sideA);
    }

    @Override
    public double area() {
        return sideB*sideA;
    }

    @Override
    public String toString() {
        return super.toString() +
        "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
