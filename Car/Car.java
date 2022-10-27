package Car;
import java.util.*;


public class Car {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        CarInfo c1 = new CarInfo();
        c1.inputCarDetails();
        c1.priceUsed();
        System.out.println("Enter travelled distance: ");
        float travel = sc.nextFloat();
        float Mileage = c1.Milage(travel);
        System.out.println("How much fuel car consumed: ");
        float fuelCon = sc.nextFloat();
        c1.UpdateMilage();
        c1.outputDetails();
        float odo = c1.getOdometer(travel , fuelCon);
        System.out.println("Odometer of the is: " + odo);

}
}