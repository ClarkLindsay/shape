package edu.jalc.shape.rectangle;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;

public final class Square extends Rectangle{

   public Square(double width){
      super(width, width);
   }
   
   public String toString(){
      return "The area of the square is: " + area() + ". The perimeter is " + perimeter();
   }
   
   public final Square toSquare(TwoDimensionalShape other){
      double  width = Math.sqrt(other.area());
      return new Square(width);
   } 
}