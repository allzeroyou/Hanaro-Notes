// 도형 만드는 파일

package shape;

public class Graph {
    public static void main(String[] args) {
        System.out.println("Graph~");

        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(10, 10, 20, 20);
        shapes[1] = new Triangle(10, 10, 20, 20);
        shapes[2] = new Circle(10, 10, 20);

        for(Shape shape: shapes){ // 다형성 구현
            System.out.println(shape.getArea());
            if(shape instanceof Circle){
                Circle c = (Circle) shape;// 왜 이걸 해주는 거지? 다운그레이드?? 부모 -> 자식으로??
                System.out.println(c.getR());
            }
        }


    }
}
