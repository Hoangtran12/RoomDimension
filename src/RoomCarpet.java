public class RoomCarpet {
// Define the cost
    private double cost_of_carpet;

    //Gets RoomDimension class
    RoomDimension roomdimension;

    //Parameterized constructor
    public RoomCarpet(double cost_of_carpet, RoomDimension roomdimension) {
        super();
        this.cost_of_carpet = cost_of_carpet;
        this.roomdimension = roomdimension;
    }

    //Input
    public double getCost_of_carpet() {
        return cost_of_carpet;
    }

    //Output the cost
    public double totalCostOfCarpet() {
        return getCost_of_carpet() * roomdimension.areaOfRoom();
    }

}