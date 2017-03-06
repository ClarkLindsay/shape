package edu.jalc.shape.rightTriangle;

class RightTriangleTest{

   public void testArea(){
      System.out.println("Testing RightTriangle::Area");
      RightTriangle rightTriangle = new RightTriangle(2, 3, 4);
      assert(rightTriangle.area() == (2*3)/2);
   }
   
   public void testPerimeter(){
      System.out.println("Testing RightTriangle::Perimeter");
      RightTriangle rightTriangle = new RightTriangle(2, 3, 4);
      assert(rightTriangle.perimeter() == 2+3+4);
   }
   
   public void testToString(){
      System.out.println("Testing RightTriangle::ToString");
      RightTriangle rightTriangle = new RightTriangle(2, 3, 4);
      assert(rightTriangle.toString().equals("The area of the right triangle is: " + rightTriangle.area() + ". The perimeter is: " + rightTriangle.perimeter()));
   } 
   
   public static void main(String[] args){
      RightTriangleTest test = new RightTriangleTest();
      test.testArea();
      test.testPerimeter();
      test.testToString();
   }
}