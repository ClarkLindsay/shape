package edu.jalc.shape.twoDimensionalShape;

import edu.jalc.shape.ellipse.Circle;
import edu.jalc.shape.rectangle.Square;

public abstract class TwoDimensionalShape{

abstract public double area();
   
   public final boolean equals(TwoDimensionalShape compareTo){
      if (this.area() == compareTo.area())
         return true;
      else 
         return false;   
   }
   
   public final Circle toCircle(){
      double radius = Math.sqrt(this.area()/Math.PI);
      Circle circle = new Circle(radius);
      return circle;
   } 
   
   public final Square toSquare(){
      double  width = Math.sqrt(this.area());
      Square square = new Square(width);
      return square;
   } 
}