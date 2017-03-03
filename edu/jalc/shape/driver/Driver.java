package edu.jalc.shape.driver;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;
import edu.jalc.shape.fourSidedShape.Rectangle;
import edu.jalc.shape.fourSidedShape.Square;
import edu.jalc.shape.threeSidedShape.RightTriangle;
import edu.jalc.shape.infiniteSidedShape.Circle;
import edu.jalc.shape.infiniteSidedShape.Ellipse;

class Driver{

   public static void main(String[] args){
      Rectangle rectang = new Rectangle(2, 4);
      System.out.println(rectang.area());
      Square square = new Square(2, 4);
      System.out.println(square.area());
      System.out.println(square.equals(rectang, square));
      RightTriangle rightTriangle = new RightTriangle(2, 8, 1, 1, 1);
      System.out.println(rightTriangle.area());
      System.out.println(rectang.equals(rectang, rightTriangle));
      Ellipse ellipse = new Ellipse(2, 4);
      System.out.println(ellipse.circumference());
      Circle circle = new Circle(4);
      System.out.println(circle.circumference());
      System.out.println(circle.toString());
   }
}