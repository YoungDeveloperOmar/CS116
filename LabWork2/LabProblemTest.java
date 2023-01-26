package LabWork2;

public class LabProblemTest {

    public static void main(String args[]){
        // Instantiate the LabWork1.BoxVolumeCalculator class object (calling constructor)
        BoxVolumeCalculator myCalculator = new BoxVolumeCalculator();

        // Show field values before using setter methods to change them
        System.out.println("Initial dimensions:");
        System.out.println("Length: " + myCalculator.getLength() + " | Width: " + myCalculator.getWidth() + " | Height: " + myCalculator.getHeight());

        // Set box dimensions using mutator / setter methods
        myCalculator.setLength(2.0);
        myCalculator.setWidth(3.0);
        myCalculator.setHeight(4.0);

        // Show field values before using setter methods to change them
        System.out.println("New dimensions:");
        System.out.println("Length: " + myCalculator.getLength() + " | Width: " + myCalculator.getWidth() + " | Height: " + myCalculator.getHeight());

        // Re-calculate box volume
        myCalculator.calculateVolume();

        // Show the current box volume
        System.out.println("Calculated volume: " + myCalculator.getVolume());


    }
}
