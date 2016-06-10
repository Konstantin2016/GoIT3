package module4.module4_1_1;


public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(12, 12);
        Rectang rectang = new Rectang(10, 10);
        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectang.area());
            }
}
