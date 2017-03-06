package edu.jalc.shape.ellipse;

class EllipseTest{

   public void testArea(){
      System.out.println("Testing Ellipse::Area");
      Ellipse ellipse = new Ellipse(2, 4);
      assert(ellipse.area() == 2*4*Math.PI);
   }
   
   public void testCircumference(){
      System.out.println("Testing Ellipse::Circumference");
      Ellipse ellipse = new Ellipse(2, 4);
      assert(ellipse.circumference() == 2*Math.PI*Math.sqrt((Math.pow(2, 2) + Math.pow(4, 2))/2));
   }
   
   public void testToString(){
      System.out.println("Testing Ellipse::ToString");
      Ellipse ellipse = new Ellipse(2, 4);
      assert(ellipse.toString().equals("The area of the ellipse is: " + ellipse.area() + ". The circumference is " + ellipse.circumference()));
   } 
   
   public static void main(String[] args){
      EllipseTest test = new EllipseTest();
      test.testArea();
      test.testCircumference();
      test.testToString();
   }
}