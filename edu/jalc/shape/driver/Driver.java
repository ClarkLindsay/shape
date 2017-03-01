package edu.jalc.shape.driver;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;
import edu.jalc.shape.fourSidedShape.Rectangle;
import edu.jalc.shape.fourSidedShape.Square;
import edu.jalc.shape.threeSidedShape.RightTriangle;
import edu.jalc.shape.circle.Circle;
import edu.jalc.shape.ellipse.Ellipse;

class Driver{

   public static void main(String[] args){
      Rectangle rectang = new Rectangle(2, 4);
      System.out.println(rectang.area());
      Square square = new Square(2, 3.99);
      System.out.println(square.area());
      TwoDimensionalShape twoD = new TwoDimensionalShape();
      System.out.println(twoD.equals(rectang.area(), square.area()));
      RightTriangle rightTriangle = new RightTriangle(2, 8, 1, 1, 1);
      System.out.println(rightTriangle.area());
      System.out.println(twoD.equals(rectang.area(), rightTriangle.area()));
      Ellipse ellipse = new Ellipse(2, 4);
      System.out.println(ellipse.circumference());
      Circle circle = new Circle(4);
      System.out.println(circle.circumference());
   }
}