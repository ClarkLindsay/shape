package edu.jalc.shape.infiniteSidedShape;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;

public class Circle extends InfiniteSidedShape{

   private double r;
   
   public Circle(double r){
      super(r, r);
   }
   
   public double area(){
      return super.area();
   }
   
   public double circumference(){
      return super.circumference();
   }
   
   public String toString(){
      return "The area of the circle is: " + area() + ". The circumference is " + circumference();
   }
   
    public boolean equals(TwoDimensionalShape b){
      return super.equals(this, b);
   }
}