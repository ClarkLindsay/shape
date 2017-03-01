package edu.jalc.shape.fourSidedShape;

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
      return "A square is a rectangle with all sides of the same length";
   }
}