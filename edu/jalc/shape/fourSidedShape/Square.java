package edu.jalc.shape.fourSidedShape;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;

public class Square extends FourSidedShape{

   public Square(double w, double l){
      super(w, l);
   }

   public double area(){
      return super.area();
   }
   
   public double perimeter(){
      return super.perimeter();
   }
   
   public String toString(){
      return "The area is: " + area() + ". The perimeter is: " + perimeter();
   }
   
   public boolean equals(TwoDimensionalShape b){
      return super.equals(this, b);
   }
}