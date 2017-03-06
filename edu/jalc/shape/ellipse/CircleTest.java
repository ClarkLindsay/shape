package edu.jalc.shape.ellipse;

class CircleTest{

   public void testArea(){
      System.out.println("Testing Circle::Area");
      Circle circle = new Circle(4);
      assert(circle.area() == 4*4*Math.PI);
   }
   
   public void testCircumference(){
      System.out.println("Testing Circle::Circumference");
      Circle circle = new Circle(4);
      assert(circle.circumference() == 2*4*Math.PI);
   }
   
   public void testToString(){
      System.out.println("Testing Circle::ToString");
      Circle circle = new Circle(4);
      assert(circle.toString().equals("The area of the circle is: " + circle.area() + ". The circumference is " + circle.circumference()));
   } 
   
   public static void main(String[] args){
      CircleTest test = new CircleTest();
      test.testArea();
      test.testCircumference();
      test.testToString();
   }
}