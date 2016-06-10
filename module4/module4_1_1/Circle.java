package module4.module4_1_1;


class Circle extends Area {
    Circle (int getCircleRadius){
        super(getCircleRadius);
    }
    @Override
    public double area () {
        return  2 * Math.PI * getCircleRadius();
            }
}
