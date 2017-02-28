class Triangles extends TwoDimensionalShape{

   double w, h, a, b, c; 

   public Triangles(double w, double h, double a, double b, double c){
      this.w = w;
      this.h = h;
      this.a = a;
      this.b = b;
      this.c = c;
   }

   public double area(){
      return (b * h) / 2;
   }
   
   public double perimeter(){
      return a + b + c;
   }   
}