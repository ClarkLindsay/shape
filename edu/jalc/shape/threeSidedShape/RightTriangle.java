package edu.jalc.shape.threeSidedShape;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;

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
      return "The area is: " + area() + ". The perimeter is: " + perimeter();
   }
   
    public boolean equals(TwoDimensionalShape b){
      return super.equals(this, b);
   }
}