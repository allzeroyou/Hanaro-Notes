package shape;

public class Circle extends Shape {
    private double r; // private: 다른 클래스에서 볼 수 없음.

    public double getR() {
        return r;
    }

    public Circle(int x, int y, double r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.pow(r, 2) * Math.PI;
    }

    @Override
    public double getCircume() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
