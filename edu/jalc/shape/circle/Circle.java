package edu.jalc.shape.circle;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;

public class Circle extends TwoDimensionalShape{

   private double r;
   
   public Circle(double r){
      this.r = r;
   }
   
   public double area(){
      return r*r*Math.PI;
   }
   
   public double circumference(){
      return 2*r*Math.PI;
   }
}