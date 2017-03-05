package edu.jalc.shape.ellipse;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;

public class Ellipse extends TwoDimensionalShape{

   private double minorAxis;
   private double majorAxis;
   
   public Ellipse(double minorAxis, double majorAxis){
      this.minorAxis = minorAxis;
      this.majorAxis = majorAxis;
   }
   
   public final double area(){
      return Math.PI*minorAxis*majorAxis;
   }
   
   public double circumference(){
      return 2*Math.PI*Math.sqrt((Math.pow(minorAxis, 2) + Math.pow(majorAxis, 2))/2);
   }
   
   public String toString(){
      return "The area of the ellipse is: " + area() + ". The circumference is " + circumference();
   }
}