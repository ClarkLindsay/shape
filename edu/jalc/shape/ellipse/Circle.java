package edu.jalc.shape.ellipse;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;

public final class Circle extends Ellipse{

   private double radius;
   
   public Circle(double radius){
      super(radius, radius);
      this.radius = radius;
   }
   
   public double circumference(){
      return 2*Math.PI*radius;
   }
      
   public String toString(){
      return "The area of the circle is: " + area() + ". The circumference is " + circumference();
   }
   
   public final Circle toCircle(TwoDimensionalShape other){
      double radius = Math.sqrt(other.area()/Math.PI);
      return new Circle(radius);
   }   
}