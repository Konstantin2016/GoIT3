package module4.module4_1_1;
class Triangle extends Area{
    private int triangleBase;
    private int triangleHeight;

Triangle (int triangleHeight,int triangleBase){
    this.triangleHeight = triangleHeight;
    this.triangleBase = triangleHeight;
}
    @Override
    public double area (){
        return triangleBase*triangleHeight / 2;
    }

}
