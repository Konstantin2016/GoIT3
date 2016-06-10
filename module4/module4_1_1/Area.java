package module4.module4_1_1;


abstract class Area {

    private int triangleHeight;
    private int  triangleBase;
    private int circleRadius;
    private double rectanglWidt;
    private double rectanglLength;
   /* Area (){
        this.triangleHeight = triangleHeight;
        this.triangleBase = triangleBase;
        this.circleRadius = circleRadius;
        this.rectanglWidt = rectanglWidt;
        this.rectanglLength = rectanglLength;
    }*/
    //конструктор для абстрактоного класса площадь
    Area (int triangleHeight, int triangleBase){
        this.triangleHeight = triangleHeight;
        this.triangleBase = triangleBase;
            }
    Area (int circleRadius){
        this.circleRadius = circleRadius;
                    }
    Area (double rectanglWidt, double rectanglLength) {
        this.rectanglLength = rectanglLength;
        this.rectanglWidt = rectanglWidt;

    }


    public abstract double area ();

    public int getTriangleHeight() {
        return triangleHeight;
    }

    public int getTriangleBase() {
        return triangleBase;
    }

    public int getCircleRadius() {
        return circleRadius;
    }

    public double getRectanglWidt() {
        return rectanglWidt;
    }

    public double getRectanglLength() {
        return rectanglLength;
    }
}
