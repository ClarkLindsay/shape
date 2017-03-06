package edu.jalc.shape.rectangle;

class SquareTest{

   public void testArea(){
      System.out.println("Testing Square::Area");
      Square square = new Square(4);
      assert(square.area() == 4*4);
   }
   
   public void testPerimeter(){
      System.out.println("Testing Square::Perimeter");
      Square square = new Square(4);
      assert(square.perimeter() == 4+4+4+4);
   }
   
   public void testToString(){
      System.out.println("Testing Square::ToString");
      Square square = new Square(4);
      assert(square.toString().equals("The area of the square is: " + square.area() + ". The perimeter is " + square.perimeter()));
   } 
   
   public static void main(String[] args){
      SquareTest test = new SquareTest();
      test.testArea();
      test.testPerimeter();
      test.testToString();
   }
}