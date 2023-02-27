package LabWork4;

public class Vector {
    private int startPointX, startPointY,endPointX,endPointY;

    public Vector(int startPointX , int startPointY) {
        this.startPointX = startPointX;
        this.startPointY = startPointY;
    }
    public Vector(){
        startPointY = 0;
        startPointY = 0;
    }

    public int getStartPointX() {
        return startPointX;
    }

    public int getStartPointY() {
        return startPointY;
    }

    public int getEndPointX() {
        return endPointX;
    }

    public int getEndPointY() {
        return endPointY;
    }
    public double getLength(){
        return Math.sqrt(Math.pow(this.endPointX - this.startPointX, 2) + Math.pow(this.endPointY - this.startPointY, 2));
    }
}
