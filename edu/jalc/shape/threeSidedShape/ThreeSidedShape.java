package edu.jalc.shape.threeSidedShape;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;

class ThreeSidedShape extends TwoDimensionalShape{

   private double w, h, a, b, c; 

   public ThreeSidedShape(double w, double h, double a, double b, double c){
      this.w = w;
      this.h = h;
      this.a = a;
      this.b = b;
      this.c = c;
   }

   public double area(){
      return (w * h) / 2;
   }
   
   public double perimeter(){
      return a + b + c;
   }   
}