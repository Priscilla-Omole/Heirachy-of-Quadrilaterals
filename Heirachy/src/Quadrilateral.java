public class Quadrilateral {
    private Coordinate coordinate1; // first endpoint
    private Coordinate coordinate2; // second endpoint
    private Coordinate coordinate3; // third endpoint
    private Coordinate coordinate4; // fourth endpoint

        // eight-argument constructor
         public Quadrilateral( double x1, double y1, double x2, double y2,
double x3, double y3, double x4, double y4 )
 {
        coordinate1 = new Coordinate( x1, y1 );
        coordinate2 = new Coordinate( x2, y2 );
        coordinate3 = new Coordinate( x3, y3 );
        coordinate4 = new Coordinate( x4, y4 );
         } // end eight-argument Quadrilateral constructor

        // return point1
        public Coordinate getPoint1()
 {
         return coordinate1;
        } // end method getPoint1
    // return point2
         public Coordinate getPoint2()
{
        return coordinate2;
} // end method getPoint2
        // return point3
         public Coordinate getPoint3()
{
         return coordinate3;
         } // end method getPoint3

        // return point4
        public Coordinate getPoint4()
 {
        return coordinate4;
         } // end method getPoint4
        // return string representation of a Quadrilateral object
         public String toString() {
             return String.format("%s:\n%s", "Coordinates of Quadrilateral are", getCoordinatesAsString() );
         }
    public String getCoordinatesAsString()
 {
        return String.format("%s, %s, %s, %s\n", coordinate1, coordinate2, coordinate3, coordinate4);
 } // end method getCoordinatesAsString
} // e




