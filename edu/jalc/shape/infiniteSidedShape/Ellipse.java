package edu.jalc.shape.infiniteSidedShape;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;

public class Ellipse extends InfiniteSidedShape{

   private double minorAxis;
   private double majorAxis;
   
   public Ellipse(double minorAxis, double majorAxis){
      super(minorAxis, majorAxis);
   }
   
   public double area(){
      return super.area();
   }
   
   public double circumference(){
      return super.circumference();
   }
   
   public String toString(){
      return "The area of the ellipse is: " + area() + ". The circumference is " + circumference();
   }
   
   public boolean equals(TwoDimensionalShape b){
      return super.equals(this, b);
   }
}