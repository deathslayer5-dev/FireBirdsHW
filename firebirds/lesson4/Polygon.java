package lesson4;
import java.lang.Math;
abstract class polygon{
    protected int sides;
    protected double[] sideLengths;

    public polygon(int sides, double[] Lengths){
        this.sides=sides;
        this.sideLengths = sideLengths;
    }
    public polygon(int sides, int[] Lengths){
        this.sides=sides;
        this.sideLengths = sideLengths;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract int getArea(int i);
    public abstract int getPerimeter(int i);
    public int getSidesNo(){
        return sides;
    }
    public double getArea(boolean b, double h){
        return getArea()*h;
    }
    public int getArea(boolean b, int h){
        return getArea(1)*h;
    }
}
class triangle extends polygon{
    public triangle(double a, double b, double c){
        super(3,new double[]{a,b,c});
    }
    public triangle(int a, int b, int c){
        super(3,new int[]{a,b,c});
    }
    @Override
    public double getPerimeter(){
        return sideLengths[0] + sideLengths[1]+sideLengths[2];
    }
    @Override
    public double getArea(){
        double s =getPerimeter()/2;
        return Math.sqrt(s*(s-sideLengths[0])*(s-sideLengths[1])*(s-sideLengths[2]));
    }
   @Override
    public int getPerimeter(int i){
        return (int) (sideLengths[0] + sideLengths[1]+sideLengths[2]);
    }
    @Override
    public int getArea(int i){
        int s =getPerimeter(1)/2;
        return (int) Math.sqrt(s*(s-sideLengths[0])*(s-sideLengths[1])*(s-sideLengths[2]));
    }
    public double findThirdAngle(double angle1,double angle2){
        return 180 - (angle1+angle2);
    }
    public double findThirdAngle(double angle1,double angle2, boolean b){
        return Math.PI-(angle1+angle2);
    }
}
class isoscelesTriangle extends triangle{
    private double base;
    private double equal;
    public isoscelesTriangle(double base,double equal){
        super(base,equal,equal);
        this.base = base;
        this.equal = equal;
    }
    @Override
    public double getArea(){
        return (base/4) *Math.sqrt(4*equal*equal-base*base);
    }
}
class equilateralTriangle extends triangle{
    private double length;
    public equilateralTriangle(double length){
        super(length,length,length);
        this.length = length;
    }
    @Override
    public double getArea(){
        return (Math.sqrt(3) /4)* length * length;
    }
}
class rightTriangle extends triangle{
    private double leg1;
    private double leg2;
    private double hypotenuse;
    public rightTriangle(double leg1, double leg2){
        super (leg1, leg2, Math.sqrt(leg1*leg1 + leg2*leg2));
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.hypotenuse = Math.sqrt(leg1*leg1 + leg2*leg2);
    }
    @Override
    public double getArea(){
        return 0.5*leg1*leg2;
    }
}
class quadrilateral extends polygon{
    private double[] lengths;
    public quadrilateral(double a, double b, double c, double d){
        super(4,new double[] {a,b,c,d});
        double[] lengths = {a,b,c,d};
        this.lengths = lengths;
    }
    @Override
    public double getPerimeter(){
        double sum = 0;
        for(double d : lengths){
            sum+= d;
        }
        return sum;
    }
    @Override
    public double getArea(){
        double s =getPerimeter()/2;
        return Math.sqrt((s-lengths[0])*(s-lengths[1])*(s-lengths[2])*(s-lengths[3]));
    }   
    @Override
    public int getPerimeter(int i){
        int sum = 0;
        for(double d:lengths){
            sum+= (int)d;
        }
        return sum;
    }
    @Override 
    public int getArea(int i){
        int s = getPerimeter(1)/2;
        return (int) Math.sqrt((s-lengths[0])*(s-lengths[1])*(s-lengths[2])*(s-lengths[3]));
    }
}
class rectangle extends quadrilateral{
    private double length;
    private double width;
    public rectangle(double length, double width){
        super(length,width,length,width);
        this.length=length;
        this.width=width;
    }
    @Override
    public double getArea(){
        return length*width;
    }
}
class square extends rectangle{
    private double length;
    public square(double length){
        super(length,length);
        this.length = length;
    }
    @Override
    public double  getArea(){
        return length*length;
    }
    @Override
    public int getArea(int i){
        return (int)length * (int)length;
    }
}
class kite extends quadrilateral{
    private double d1;
    private double d2;
    public kite(double side1, double side2,double d1, double d2){
        super(side1,side1,side2,side2);
        this.d1 =d1;
        this.d2=d2;
    }
    @Override
    public double getArea(){
        return(d1*d2)/2;
    }
}
class trapezoid extends quadrilateral{
    private double base1;
    private double base2;
    private double height;
    public trapezoid(double a, double b, double h, double side1, double side2){
        super (a, side1, b, side2);
        this.base1=a;
        this.base2=b;
        this.height=h;
    }
    @Override
    public double getArea(){
        return (base1+base2)*height/2;
    }
}
