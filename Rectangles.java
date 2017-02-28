class Rectangles extends TwoDimensionalShape{

   private double w;
   private double l;

   public Rectangles(double w, double l){
      this.w = w;
      this.l = l;
   }

   public double area(){
      return w * l;
   }
   
   public double perimeter(){
      return 2 * (w + l);
   }
}