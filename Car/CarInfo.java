package Car;

import java.util.*;

public class CarInfo {
    String brandName;
    float priceNew;
    String color;
    float odometer;
    float priceUsed;
    float distance;
    float fuelCon;
    Scanner sc = new Scanner(System.in);

    float priceUsed(){
        System.out.println("Enter Car New Price: ");
        this.priceUsed = sc.nextFloat();
        return this.priceUsed;
    }


    float Milage(float travelDistance){
         distance = travelDistance;
        return distance;
    }

    float getOdometer(float travelDistance , float fuelConsumed){
        float Odometer = travelDistance/fuelConsumed;
        return Odometer;
    }

    void UpdateMilage(){
        System.out.println("Do you want to update Milage? ");
        System.out.println("Press 1 to Update");
        System.out.println("Press 2 to Skip");
        int choice = sc.nextInt();
        if (choice == 1 ){
            System.out.println("Update Milage: ");
            float update = sc.nextFloat();
            update = distance;

            System.out.println("Now the Updated Milage is " + update);
        }
        else if ( choice == 2){
            return;
        }

    }

    void inputCarDetails(){
        System.out.println("Enter Car Name: ");
        this.brandName = sc.nextLine();
        System.out.println("Enter Car Color: ");
        this.color = sc.nextLine();
        System.out.println("Enter Car Price: ");
        this.priceNew = sc.nextFloat();
    }

    void outputDetails(){
        System.out.println("Car Name: " + this.brandName);
        System.out.println("Car Color: " + this.color);
        System.out.println("Car Price: " + this.priceNew);
    }
}