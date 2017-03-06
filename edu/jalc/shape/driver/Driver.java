package edu.jalc.shape.driver;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;
import edu.jalc.shape.rectangle.Rectangle;
import edu.jalc.shape.rectangle.Square;
import edu.jalc.shape.rightTriangle.RightTriangle;
import edu.jalc.shape.ellipse.Circle;
import edu.jalc.shape.ellipse.Ellipse;

abstract class Driver{

   public static void main(String[] args){
      Rectangle rectang = new Rectangle(2, 8);
      Square square = new Square(4);
      RightTriangle rightTriangle = new RightTriangle(2, 8, 4);
      Ellipse ellipse = new Ellipse(2, 4);
      Circle circle = new Circle(4);
      
      System.out.println(rectang.toString());
      System.out.println(square.toString());
      System.out.println(rightTriangle.toString());
      System.out.println(ellipse.toString());
      System.out.println(circle.toString());
      
      System.out.println(rectang.equals(rightTriangle));
      System.out.println(square.equals(rectang));
      System.out.println(rightTriangle.equals(square));
      System.out.println(ellipse.equals(circle));
      System.out.println(circle.equals(square));
       
      System.out.println(circle.toCircle(rectang));
      System.out.println(circle.toCircle(square));
      System.out.println(circle.toCircle(rightTriangle));
      System.out.println(circle.toCircle(ellipse));
      
      System.out.println(square.toSquare(rectang));
      System.out.println(square.toSquare(rightTriangle));
      System.out.println(square.toSquare(ellipse));
      System.out.println(square.toSquare(circle));
   }
}