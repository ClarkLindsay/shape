package edu.jalc.shape.rightTriangle;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;

public class RightTriangle extends TwoDimensionalShape{
 
   
   private double base, heigth, hypotenuse; 

   public RightTriangle(double base, double heigth, double hypotenuse){
      this.base = base;
      this.heigth = heigth;
      this.hypotenuse = hypotenuse;
   }

   public double area(){
      return (base * heigth) / 2;
   }
   
   public double perimeter(){
      return base + heigth + hypotenuse;
   }  
      
   public String toString(){
      return "The area of the right triangle is: " + area() + ". The perimeter is: " + perimeter();
   }
   
   public boolean equals(TwoDimensionalShape b){
      return super.equals(this, b);
   }
}