package edu.jalc.shape.ellipse;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;

public class Circle extends Ellipse{

   private double radius;
   
   public Circle(double radius){
      super(radius, radius);
   }
      
   public String toString(){
      return "The area of the circle is: " + area() + ". The circumference is " + circumference();
   }
   
    public boolean equals(TwoDimensionalShape b){
      return super.equals(this, b);
   }
}