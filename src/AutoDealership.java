
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class AutoDealership {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String manufacturer, model, ownerFirstName, ownerLastName, year, mileage;
        String compare;
        final int GIVEN_MILEAGE = 100000;
        try {
            BufferedWriter saleWriter = new BufferedWriter(new FileWriter("VehiclesForSale.txt"));
            BufferedWriter auctionWriter1 = new BufferedWriter(new FileWriter("VehiclesForAuction.txt"));
            do {
                System.out.println("Enter car manufacturer name: ");
                manufacturer = userInput.nextLine();
                System.out.println("Enter car model: ");
                model = userInput.nextLine();
                System.out.println("Enter manufacturing year: ");
                year = userInput.nextLine();
                System.out.println("Enter owner's first name: ");
                ownerFirstName = userInput.nextLine();
                System.out.println("Enter owner's last name: ");
                ownerLastName = userInput.nextLine();
                System.out.println("Enter car's mileage: ");
                mileage = userInput.nextLine();
                String database = manufacturer+ "," + model+ "," + year+ "," + ownerFirstName+ "," + ownerLastName+ "," + mileage;
                if (Integer.parseInt(mileage) < GIVEN_MILEAGE) {
                    saleWriter.write(database + "\n");
                } else {
                    auctionWriter1.write(database + "\n");
                }
                System.out.println("Please type con to continue or quit to close the application : ");
                compare = userInput.nextLine();
            } while (!compare.equals("quit"));
            saleWriter.close();
            auctionWriter1.close();
        } catch (Exception e) {
            System.out.println("Exception is: "+e);
        }
        }

}
