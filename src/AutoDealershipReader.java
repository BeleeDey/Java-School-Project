import java.io.BufferedReader;
import java.io.FileReader;

public class AutoDealershipReader {
    public static void main(String[] args) {

        try {
            BufferedReader saleReader = new BufferedReader(new FileReader("VehiclesForSale.txt"));
            BufferedReader auctionReader = new BufferedReader(new FileReader("VehiclesForAuction.txt"));
            String outputPrint = saleReader.readLine();
            System.out.println("Autos for Sale");
            System.out.printf("%20s%-10s%-10s%-10s%-10s%-10s%-10s\n", " ", "Make", "Model", "Year", "Firstname",
                    "Lastname", "Mileage");
            while (outputPrint != null) {
                String[] arrayElement = outputPrint.split(",");
                System.out.printf("%20s%-10s%-10s%-10s%-10s%-10s%-10s\n", " ", arrayElement[0], arrayElement[1],
                        arrayElement[2], arrayElement[3], arrayElement[4], arrayElement[5]);
                outputPrint = saleReader.readLine();
            }
            saleReader.close();
            String outputPrint1 = auctionReader.readLine();
            System.out.println("Autos for Auction");
            System.out.printf("%20s%-10s%-10s%-10s%-10s%-10s%-10s\n", " ", "Make", "Model", "Year", "Firstname",
                    "Lastname", "Mileage");
            while (outputPrint1 != null) {
                String[] arrayElement1 = outputPrint1.split(",");
                System.out.printf("%20s%-10s%-10s%-10s%-10s%-10s%-10s\n", " ", arrayElement1[0], arrayElement1[1],
                        arrayElement1[2], arrayElement1[3], arrayElement1[4], arrayElement1[5]);
                outputPrint1 = auctionReader.readLine();
            }
            auctionReader.close();
        } catch (Exception e) {
            System.out.println("Exception is: " + e);
        }
    }


}
