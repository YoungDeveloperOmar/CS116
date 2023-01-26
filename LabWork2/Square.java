package LabWork2;

public class Square {
    // Comments for lab partners

    // We have UML format given and we saw that we have 2 instance variables : side - double and lowerLeft - LabWork1.Point2D.
    private double side ;
    private Point2D lowerLeft = new Point2D(); // Create default point which is ( 0, 0 ) by default . LabWork1.Point2D means that we use class LabWork1.Point2D . We can imagine this line as follows : LabWork1.Point2D lowerLeft = new LabWork1.Point2D()
    public Square(double newSide , Point2D newLowerLeft){ // non default with parameters constructor
        if ( newSide >= 0){ // error checking
            setSide(newSide);
        }
        else {
            setSide(0);
        }
        if (newLowerLeft == null){ // if nothing is given we set the value to 0 , 0 ( default )
            setLowerLeft(new Point2D());
        }
        else {
            setLowerLeft(newLowerLeft);
        }


    }
    public Square(Square otherSquare) { // Constructor to copy other object
        if ( otherSquare == null ){ // if object does not exist we assign default value for it.
            setSide(0);
            new Point2D();
        }
        else {
            setSide(otherSquare.getSide());
            setLowerLeft(otherSquare.getLowerLeft());
        }
    }
    public Square(){ // non-  Default constructor no parametrs
        setSide(0);
        new Point2D();
    }
    // Getters and setters
    public Point2D getLowerLeft() {
        return lowerLeft;
    }
    public double getSide() {
        return side;
    }
    private void setSide(double side) {
        if (side >= 0 ) {
            this.side = side;
        }
        else {
            this.side = 0;
        }
    }

    private void setLowerLeft(Point2D lowerLeft) {
        if (lowerLeft != null){ // we do error checking in case we get null attribute ( no attribute )
            this.lowerLeft = new Point2D(lowerLeft);
        }
    }

    public double getArea(){
        return  Math.pow(getSide() , 2);
    }
    public double getCircumference(){
        return 4 * getSide();
    }
    public boolean equals(Square otherSquare){ // method equals that checks if 2 objects has the same values ( NOT ADRESS )
        if ( otherSquare != null){ // check if object exists
            if ( otherSquare.getLowerLeft().equals(getLowerLeft())){ // first we check if objects has the same lowerLeft value
                if ( otherSquare.getSide() == getSide()){ // after we check if they have same side
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
       else {
           return false;
        }

    }
    public String toString() { // To string method should be in required format
        return "LabWork1.Square : lower left corner: " + getLowerLeft() + " | " + "side:" + getSide() + " | " + "area: " + getArea() + " | " + " circumference:" + getCircumference();
    }
}
