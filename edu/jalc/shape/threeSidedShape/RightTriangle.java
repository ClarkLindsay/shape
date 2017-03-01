package edu.jalc.shape.threeSidedShape;

public class RightTriangle extends ThreeSidedShape{
 
   public RightTriangle(double w, double h, double a, double b, double c){
      super(w, h, a, b, c);
   }
   
   public double area(){
      return super.area();
   }
   
   public double perimeter(){
      return super.perimeter();
   }
   
   public String toString(){
      return "A right triangle has one ninty-degree angle and two smaller ones";
   }
}