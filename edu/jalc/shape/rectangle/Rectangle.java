package edu.jalc.shape.rectangle;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;

public class Rectangle extends TwoDimensionalShape{

   private double width;
   private double length;

   public Rectangle(double width, double length){
      this.width = width;
      this.length = length;
   }

   public double area(){
      return width * length;
   }
   
   public double perimeter(){
      return 2 * (width + length);
   }
      
   public String toString(){
      return "The area of the rectangle is: " + area() + ". The perimeter is " + perimeter();
   }
   
   public boolean equals(TwoDimensionalShape b){
      return super.equals(this, b);
   }
}