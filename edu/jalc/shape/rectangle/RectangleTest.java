package edu.jalc.shape.rectangle;

class RectangleTest{

   public void testArea(){
      System.out.println("Testing Rectangle::Area");
      Rectangle rectangle = new Rectangle(2, 4);
      assert(rectangle.area() == 2*4);
   }
   
   public void testPerimeter(){
      System.out.println("Testing Rectangle::Perimeter");
      Rectangle rectangle = new Rectangle(2, 4);
      assert(rectangle.perimeter() == 2+2+4+4);
   }
   
   public void testToString(){
      System.out.println("Testing Rectangle::ToString");
      Rectangle rectangle = new Rectangle(2, 4);
      assert(rectangle.toString().equals("The area of the rectangle is: " + rectangle.area() + ". The perimeter is " + rectangle.perimeter()));
   } 
   
   public static void main(String[] args){
      RectangleTest test = new RectangleTest();
      test.testArea();
      test.testPerimeter();
      test.testToString();
   }
}