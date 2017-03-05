package edu.jalc.shape.twoDimensionalShape;

import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;
import edu.jalc.shape.rectangle.Rectangle;
import edu.jalc.shape.rectangle.Square;
import edu.jalc.shape.rightTriangle.RightTriangle;
import edu.jalc.shape.ellipse.Ellipse;

class TestToCircle{

   public void testRectangle(){
      System.out.println("Testing toCircle::rectangle");
      Rectangle rectang = new Rectangle(2, 8);
      assert(Math.round(rectang.toCircle().area() * Math.pow(10, 3))/Math.pow(10, 3) == Math.round(rectang.area() * Math.pow(10, 3)) / Math.pow(10, 3)); 
   }
   
   public void testSquare(){
      System.out.println("Testing toCircle::square");
      Square square = new Square(4);
      assert(Math.round(square.toCircle().area() * Math.pow(10, 3))/Math.pow(10, 3) == Math.round(square.area() * Math.pow(10, 3)) / Math.pow(10, 3)); 
   }
   
   public void testRightTriangle(){
      System.out.println("Testing toCircle::rightTriangle");
      RightTriangle rightTriangle = new RightTriangle(2, 8, 4);
      assert(Math.round(rightTriangle.toCircle().area() * Math.pow(10, 3))/Math.pow(10, 3) == Math.round(rightTriangle.area() * Math.pow(10, 3)) / Math.pow(10, 3)); 
   }
   
   public void testEllipse(){
      System.out.println("Testing toCircle::ellipse");
      Ellipse ellipse = new Ellipse(2, 4);
      assert(Math.round(ellipse.toCircle().area() * Math.pow(10, 3))/Math.pow(10, 3) == Math.round(ellipse.area() * Math.pow(10, 3)) / Math.pow(10, 3)); 
   }
      
   public static void main(String[] args){
      TestToCircle test = new TestToCircle();
      test.testRectangle();
      test.testSquare();
      test.testRightTriangle();
      test.testEllipse();
   }
}