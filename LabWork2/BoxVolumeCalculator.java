package LabWork2;

public class BoxVolumeCalculator {
    // Comments for lab partners
    private double length , width , height , volume; // Declaring instance variables and making all of them private
    public BoxVolumeCalculator() { setLength(0); setHeight(0); setWidth(0); } // Default constructor
    // Getters and setters
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return volume;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {this.width = width;    }
    public void setHeight(double height) {this.height = height; }
    // Simple calculation method of Volume
    public double calculateVolume(){
        this.volume = length*width*height;
        return volume;
    }
}
