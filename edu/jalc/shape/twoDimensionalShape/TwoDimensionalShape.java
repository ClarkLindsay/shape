package edu.jalc.shape.twoDimensionalShape;

import edu.jalc.shape.ellipse.Circle;
import edu.jalc.shape.rectangle.Square;

public abstract class TwoDimensionalShape{

   abstract public double area();
   
   public final boolean equals(TwoDimensionalShape other){
      return (this.area() == other.area());   
   } 
}