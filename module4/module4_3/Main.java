package module4.module4_3;

public class Main {
    public static void main(String[] args){
        Distance distance = new Distance();
        distance.setX1(8);
        distance.setY1(0);
        distance.setX2(0);
        distance.setY2(6);

        System.out.println(distance.getDistace());
        System.out.println(distance.getDistanseXY(22,131,14,125));
    }
}
