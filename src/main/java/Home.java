import java.util.Scanner;

public class Home {
    static Scanner scanner = new Scanner(System.in);

    public static void homePage(){
        System.out.println("Home");
        System.out.println("Please Pick a Option");
        System.out.println("""
                1 - Find vehicles within a price range
                2 - Find vehicles by make / model
                3 - Find vehicles by year range
                4 - Find vehicles by color
                5 - Find vehicles by mileage range
                6 - Find vehicles by type (car, truck, SUV, van)
                7 - List ALL vehicles
                8 - Add a vehicle
                9 - Remove a vehicle
                x - Quit
                """);
        System.out.print("Enter:");
        String enter = scanner.nextLine().toUpperCase().trim();

    }
}
