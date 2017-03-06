package edu.jalc.shape.ellipse;

import edu.jalc.shape.rectangle.Rectangle;
import edu.jalc.shape.rectangle.Square;
import edu.jalc.shape.rightTriangle.RightTriangle;
import edu.jalc.shape.ellipse.Ellipse;

class TestToCircle{

   public void testRectangle(){
      System.out.println("Testing toCircle::rectangle");
      Circle circle = new Circle(4);
      Rectangle rectang = new Rectangle(2, 8);
      assert(Math.round(circle.toCircle(rectang).area() * Math.pow(10, 3))/Math.pow(10, 3) == Math.round(rectang.area() * Math.pow(10, 3)) / Math.pow(10, 3)); 
   }
   
   public void testSquare(){
      System.out.println("Testing toCircle::square");
      Circle circle = new Circle(4);
      Square square = new Square(4);
      assert(Math.round(circle.toCircle(square).area() * Math.pow(10, 3))/Math.pow(10, 3) == Math.round(square.area() * Math.pow(10, 3)) / Math.pow(10, 3)); 
   }
   
   public void testRightTriangle(){
      System.out.println("Testing toCircle::rightTriangle");
      Circle circle = new Circle(4);
      RightTriangle rightTriangle = new RightTriangle(2, 8, 4);
      assert(Math.round(circle.toCircle(rightTriangle).area() * Math.pow(10, 3))/Math.pow(10, 3) == Math.round(rightTriangle.area() * Math.pow(10, 3)) / Math.pow(10, 3)); 
   }
   
   public void testEllipse(){
      System.out.println("Testing toCircle::ellipse");
      Circle circle = new Circle(4);
      Ellipse ellipse = new Ellipse(2, 4);
      assert(Math.round(circle.toCircle(ellipse).area() * Math.pow(10, 3))/Math.pow(10, 3) == Math.round(ellipse.area() * Math.pow(10, 3)) / Math.pow(10, 3)); 
   }
      
   public static void main(String[] args){
      TestToCircle test = new TestToCircle();
      test.testRectangle();
      test.testSquare();
      test.testRightTriangle();
      test.testEllipse();
   }
}