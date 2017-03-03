package edu.jalc.shape.infiniteSidedShape;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;

public class InfiniteSidedShape extends TwoDimensionalShape{

   private double minorAxis;
   private double majorAxis;
   
   public InfiniteSidedShape(double minorAxis, double majorAxis){
      this.minorAxis = minorAxis;
      this.majorAxis = majorAxis;
   }
   
   public double area(){
      return Math.PI*minorAxis*majorAxis;
   }
   
   public double circumference(){
      return 2*Math.PI*Math.sqrt((Math.pow(minorAxis, 2) + Math.pow(majorAxis, 2))/2);
   }
}