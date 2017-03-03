package edu.jalc.shape.fourSidedShape;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;

public class Rectangle extends FourSidedShape{

   public Rectangle(double w, double l){
      super(w, l);
   }

   public double area(){
      return super.area();
   }
   
   public double perimeter(){
      return super.perimeter();
   }
   
   public String toString(){
      return "A rectangle is a special case of a parallelogram";
   }
   
   public boolean equals(TwoDimensionalShape b){
      return super.equals(this, b);
   }
}