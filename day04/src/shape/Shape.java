package shape;

public abstract class Shape {
    protected int x;
    protected int y;

    public Shape() {
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 추상메서드: body가 없음({})
    public abstract double getArea();

    public abstract double getCircume();// 원 둘레

    public void moveLeft(int x) {
        this.x += x;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
