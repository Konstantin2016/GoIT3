package module4.module4_1_1;


class Circle extends Area {
   private int circleRadius;

    Circle (int circleRadius){
        this.circleRadius = circleRadius;
    }
     @Override
    public double area () {
        return  2 * Math.PI * circleRadius;
            }
}
