package LabWork2;

public class Point2D {

    private final double x;
    private final double y;

    public Point2D(){
        this.x = 0.0d;
        this.y = 0.0d;
    }

    public Point2D(double initialX, double initialY){
        this.x = initialX;
        this.y = initialY;
    }

    public Point2D(Point2D otherPoint){
        if (otherPoint != null){
            this.x = otherPoint.getX();
            this.y = otherPoint.getY();
        } else {
            this.x = 0.0d;
            this.y = 0.0d;
        }
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public boolean equals(Point2D otherPoint){
        if (otherPoint != null){
            if (this.x == otherPoint.getX() && this.y == otherPoint.getY()){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }
}
