import java.util.Scanner;

public class Home {
    static Scanner scanner = new Scanner(System.in);

    public static void homePage() {
        boolean choice = true;
        while(choice) {
            System.out.println("      Home");
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
            String enter = scanner.nextLine().toLowerCase().trim();

            switch (enter) {
                case "1":
                    priceRange();
                    break;
                case "2":
                    makeModel();
                    break;
                case "3":
                    yearRange();
                    break;
                case "4":
                    color();
                    break;
                case "5":
                    mileageRange();
                    break;
                case "6":
                    type();
                    break;
                case "7":
                    all();
                    break;
                case "8":
                    add();
                    break;
                case "9":
                    remove();
                    break;
                case "x":
                    System.out.println("\nThanks for trying the app \uD83D\uDE3C\n");
                    choice = false;
                    break;
            }
        }

    }

    public static void priceRange(){

    }

    public static void makeModel(){}

    public static void yearRange(){}

    public static void color(){}

    public static void mileageRange(){}

    public static void type(){}

    public static void all(){}

    public static void add(){}

    public static void remove(){}











}
