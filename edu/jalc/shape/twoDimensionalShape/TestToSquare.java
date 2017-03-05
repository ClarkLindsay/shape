package edu.jalc.shape.twoDimensionalShape;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;
import edu.jalc.shape.rectangle.Rectangle;
import edu.jalc.shape.rightTriangle.RightTriangle;
import edu.jalc.shape.ellipse.Circle;
import edu.jalc.shape.ellipse.Ellipse;

class TestToSquare{

   public void testRectangle(){
      System.out.println("Testing toSquare::rectangle");
      Rectangle rectang = new Rectangle(2, 8);
      assert(Math.round(rectang.toSquare().area() * Math.pow(10, 3))/Math.pow(10, 3) == Math.round(rectang.area() * Math.pow(10, 3)) / Math.pow(10, 3)); 
   }
   
   public void testRightTriangle(){
      System.out.println("Testing toSquare::rightTriangle");
      RightTriangle rightTriangle = new RightTriangle(2, 8, 4);
      assert(Math.round(rightTriangle.toSquare().area() * Math.pow(10, 3))/Math.pow(10, 3) == Math.round(rightTriangle.area() * Math.pow(10, 3)) / Math.pow(10, 3)); 
   }
   
   public void testEllipse(){
      System.out.println("Testing toSquare::ellipse");
      Ellipse ellipse = new Ellipse(2, 4);
      assert(Math.round(ellipse.toSquare().area() * Math.pow(10, 3))/Math.pow(10, 3) == Math.round(ellipse.area() * Math.pow(10, 3)) / Math.pow(10, 3)); 
   }
   
   public void testCircle(){
      System.out.println("Testing toSquare::circle");
      Circle circle = new Circle(4);
      assert(Math.round(circle.toSquare().area() * Math.pow(10, 3))/Math.pow(10, 3) == Math.round(circle.area() * Math.pow(10, 3)) / Math.pow(10, 3)); 
   }
      
   public static void main(String[] args){
      TestToCircle test = new TestToCircle();
      test.testRectangle();
      test.testRightTriangle();
      test.testEllipse();
      test.testCircle();
   }
}