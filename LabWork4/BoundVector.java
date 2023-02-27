package LabWork4;

public class BoundVector extends Vector{
    private int startX,startY;
    public BoundVector(){
        super();
        this.startX = 0;
        this.startY = 0;
    }
    public BoundVector(int endX, int endY){
        super(endX, endY);
        this.startX = 0;
        this.startY = 0;
    }
    public BoundVector(int startX, int startY, int endX, int endY) {
        super(endX, endY);
        this.startX = startX;
        this.startY = startY;
    }

    public int getStartPointX() {
        return this.startX;
    }

    public int getStartPointY() {
        return this.startY;
    }

    public double getLength() {
        int xDifference = getEndPointX() - getStartPointX();
        int yDifference = getEndPointY() - getStartPointY();
        return Math.sqrt(xDifference*xDifference + yDifference*yDifference);
    }
}
