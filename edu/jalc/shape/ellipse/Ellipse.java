package edu.jalc.shape.ellipse;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;

public class Ellipse extends TwoDimensionalShape{

   private double minorAxis;
   private double majorAxis;
   
   public Ellipse(double minorAxis, double majorAxis){
      this.minorAxis = minorAxis;
      this.majorAxis = majorAxis;
   }
   
   public double area(){
      return Math.PI*minorAxis*majorAxis;
   }
   
   public double circumference(){
      return 2*Math.PI*Math.sqrt((Math.pow(minorAxis, 2) + Math.pow(majorAxis, 2))/2);
   }
   
   public String toString(){
      return "The sum of the distances between a point on the curve and two fixed points is the same anywhere on an ellipse";
   }
}