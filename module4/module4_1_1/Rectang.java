package module4.module4_1_1;

class Rectang extends Area {
    Rectang (double getRectanglLength, double getRectanglWidt) {
        super(getRectanglLength,getRectanglWidt);
            }
    @Override
    public double area () {
        return getRectanglLength()*getRectanglWidt();
    }
}
