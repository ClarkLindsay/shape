package edu.jalc.shape.twoDimensionalShape;

public abstract class TwoDimensionalShape{

   abstract public double area();
   abstract public double perimeter();
   
   public boolean equals(TwoDimensionalShape a, TwoDimensionalShape b){
      if (a.area() == b.area())
         return true;
      else 
         return false;   
   }
}