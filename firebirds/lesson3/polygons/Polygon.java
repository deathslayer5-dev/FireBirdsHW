package polygons;
import java.lang.Math;
abstract class polygon{
    protected int sides;
    protected double[] sideLengths;

    public polygon(int sides, double[]sideLengths){
        this.sides=sides;
        this.sideLengths = sideLengths;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    public int getSidesNo(){
        return sides;
    }
}
class triangle extends polygon{
    public triangle(double a, double b, double c){
        super(3,new double[]{a,b,c});
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
}
class rectangle extends polygon{
    public rectangle(double a, double b){
        super(4,new double[]{a,b,a,b});
    }
    @Override
    public double getPerimeter(){
        return (sideLengths[0] + sideLengths[1])*2;
    }
    @Override
    public double getArea(){
        return sideLengths[0]*sideLengths[1];
    }
}
class pentagon extends polygon{
    public pentagon(double side){
        super(5,new double[]{side,side,side,side,side});
    }
    @Override
    public double getPerimeter(){
        return sideLengths[0]*5;
    }
    @Override
    public double getArea(){
        return 0.25f * Math.sqrt(5*(5+2*Math.sqrt(5))) * Math.pow(sideLengths[0],2);
    }
}
class hexagon extends polygon{
    public hexagon(double side){
        super(6,new double[] {side,side,side,side,side,side});
    }
    @Override
    public double getPerimeter(){
        return sideLengths[0]*6;
    }
    @Override
    public double getArea(){
        return (3*Math.sqrt(3)*(sideLengths[0]*sideLengths[0]))/2;
    }
}
class heptagon extends polygon{
    public heptagon(double s){
        super(7, new double[] {s,s,s,s,s,s,s});
    }
    @Override
    public double getPerimeter(){
        return sideLengths[0]*7;
    }
    @Override
    public double getArea(){
        return 3.63391 * sideLengths[0]*sideLengths[0];
    }
}
class octagon extends polygon{
  public octagon(double s){
        super(8, new double[] {s,s,s,s,s,s,s,s});
    }
    @Override
    public double getPerimeter(){
        return sideLengths[0]*8;
    }
    @Override
    public double getArea(){
        return 2 *(1+Math.sqrt(2))*sideLengths[0]*sideLengths[0];
    }
}
class nonagon extends polygon{
    public nonagon(double s){
        super(9, new double[] {s,s,s,s,s,s,s,s,s});
    }
    @Override
    public double getPerimeter(){
        return sideLengths[0]*9;
    }
    @Override
    public double getArea(){
        return (9.0/4.0)*sideLengths[0]*sideLengths[0]*(1/Math.tan(Math.PI/9));
    }
}
    

