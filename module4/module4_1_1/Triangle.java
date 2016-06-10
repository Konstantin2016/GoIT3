package module4.module4_1_1;
class Triangle extends Area{
Triangle (int getTriangleBase, int getTriangleHeight ){
super( getTriangleBase, getTriangleHeight);
}
       @Override
    public double area (){
        return getTriangleBase()*getTriangleHeight() / 2;
    }

}
