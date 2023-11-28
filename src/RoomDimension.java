public class RoomDimension {
// Decfine length and width
    private double length;
    private double width;

    //Main constructor
    public RoomDimension(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    //Inputs
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    //Room Calculation
    public double areaOfRoom() {
        return getLength() * getWidth();

    }

}