package edu.jalc.shape.driver;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;
import edu.jalc.shape.rectangle.Rectangle;
import edu.jalc.shape.rectangle.Square;
import edu.jalc.shape.rightTriangle.RightTriangle;
import edu.jalc.shape.ellipse.Circle;
import edu.jalc.shape.ellipse.Ellipse;

class Driver{

   public static void main(String[] args){
      Rectangle rectang = new Rectangle(2, 4);
      System.out.println(rectang.area());
      Square square = new Square(2, 3.99);
      System.out.println(square.area());
      System.out.println(square.equals(rectang));
      RightTriangle rightTriangle = new RightTriangle(2, 8, 4);
      System.out.println(rightTriangle.area());
      System.out.println(rectang.equals(rightTriangle));
      Ellipse ellipse = new Ellipse(2, 4);
      System.out.println(ellipse.circumference());
      Circle circle = new Circle(5);
      System.out.println(circle.area());
      System.out.println(circle.toString());
   }
}