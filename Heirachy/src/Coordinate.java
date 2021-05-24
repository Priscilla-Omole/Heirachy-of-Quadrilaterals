public class Coordinate {
    private double x; // x coordinate
    private double y; // y coordinate
    // two-argument constructor
    public Coordinate(double xCoordinate, double yCoordinate )
 {
     x = xCoordinate; // set x
        y = yCoordinate; // set y
 } // end two-argument Point constructor

        // return x
        public double getX()
{
    return x;
        } // end method getX

        // return y
         public double getY()
 {
        return y;
        } // end method getY

        // return string representation of Point objectExercises 9
        public String toString() {
            return String.format("( %.1f, %.1f )", getX(), getY());
        }

}
