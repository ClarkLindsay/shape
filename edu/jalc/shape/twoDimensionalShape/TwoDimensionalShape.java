package edu.jalc.shape.twoDimensionalShape;

public abstract class TwoDimensionalShape{

abstract public double area();
   
   public boolean equals(TwoDimensionalShape compareTo){
      if (this.area() == compareTo.area())
         return true;
      else 
         return false;   
   }
}