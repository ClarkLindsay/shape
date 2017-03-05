package edu.jalc.shape.rectangle;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;

public final class Square extends Rectangle{

   public Square(double width, double length){
      super(width, length);
   }
   
   public String toString(){
      return "The area of the square is: " + area() + ". The perimeter is " + perimeter();
   }
}