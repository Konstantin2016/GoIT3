package module4.module4_1_1;

class Rectang extends Area {
    private double rectanglLength;
    private double rectanglWidt;
    Rectang (double rectanglLength, double rectanglWidt){
        this.rectanglLength = rectanglLength;
        this.rectanglWidt = rectanglWidt;
    };

    @Override
    public double area () {
        return rectanglLength * rectanglWidt;
    }

}
