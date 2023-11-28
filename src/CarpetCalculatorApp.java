import java.util.Scanner;

public class CarpetCalculatorApp {

    public static void main(String[] args) {
        //Define variables
        double length,width,carpetCostPerFt,total_carpet_cost;

        Scanner sc=new Scanner(System.in);

        //Inputs
        System.out.print("Enter the Length of the Carpet (in feet):");
        length=sc.nextDouble();

        System.out.print("Enter the Width of the Carpet (in feet):");
        width=sc.nextDouble();

        System.out.print("Enter cost of Carpet (per sq ft) :$");
        carpetCostPerFt=sc.nextDouble();

        //Pass the length and width as arguments
        
        RoomDimension dimension=new RoomDimension(length, width);

        //Create the Room Carpet class
        RoomCarpet roomcarpet=new RoomCarpet(carpetCostPerFt, dimension);

        //Call the method to calculates the cost of the carpet
        total_carpet_cost=roomcarpet.totalCostOfCarpet();

        //Display the cost of the carpet
        System.out.println("Total of cost of carpet is :$"+total_carpet_cost);


    }

}
