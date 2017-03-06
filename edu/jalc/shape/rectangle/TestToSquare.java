package edu.jalc.shape.rectangle;

//import edu.jalc.shape.twoDimensionalShape.TwoDimensionalShape;
import edu.jalc.shape.rectangle.Rectangle;
import edu.jalc.shape.rightTriangle.RightTriangle;
import edu.jalc.shape.ellipse.Circle;
import edu.jalc.shape.ellipse.Ellipse;

class TestToSquare{

   public void testRectangle(){
      System.out.println("Testing toSquare::rectangle");
      Square square = new Square(4);
      Rectangle rectang = new Rectangle(2, 8);
      assert(Math.round(square.toSquare(rectang).area() * Math.pow(10, 3))/Math.pow(10, 3) == Math.round(rectang.area() * Math.pow(10, 3)) / Math.pow(10, 3)); 
   }
   
   public void testRightTriangle(){
      System.out.println("Testing toSquare::rightTriangle");
      Square square = new Square(4);
      RightTriangle rightTriangle = new RightTriangle(2, 8, 4);
      assert(Math.round(square.toSquare(rightTriangle).area() * Math.pow(10, 3))/Math.pow(10, 3) == Math.round(rightTriangle.area() * Math.pow(10, 3)) / Math.pow(10, 3)); 
   }
   
   public void testEllipse(){
      System.out.println("Testing toSquare::ellipse");
      Square square = new Square(4);
      Ellipse ellipse = new Ellipse(2, 4);
      assert(Math.round(square.toSquare(ellipse).area() * Math.pow(10, 3))/Math.pow(10, 3) == Math.round(ellipse.area() * Math.pow(10, 3)) / Math.pow(10, 3)); 
   }
   
   public void testCircle(){
      System.out.println("Testing toSquare::circle");
      Square square = new Square(4);
      Circle circle = new Circle(4);
      assert(Math.round(square.toSquare(circle).area() * Math.pow(10, 3))/Math.pow(10, 3) == Math.round(circle.area() * Math.pow(10, 3)) / Math.pow(10, 3)); 
   }
      
   public static void main(String[] args){
      TestToSquare test = new TestToSquare();
      test.testRectangle();
      test.testRightTriangle();
      test.testEllipse();
      test.testCircle();
   }
}