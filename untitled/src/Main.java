import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        wareHouse wareHouse = new wareHouse();
        boolean exit = false;
        while (!exit) {
            System.out.println("\n--- Warehouse menu ---");
            System.out.println("1-Add toy");
            System.out.println("2-Remove toy");
            System.out.println("3-Update toy's data");
            System.out.println("4-Show all soft toys");
            System.out.println("5-Show all hard toys");
            System.out.println("6-Show all toys");
            System.out.println("7-Exit");
            System.out.println("Enter another choice: ");
            int nextChoice = scanner.nextInt();
            scanner.nextLine();
                switch (nextChoice) {
                    case 1:
                        System.out.println("Toy's Name: ");
                        String nameOfToys = scanner.nextLine().toLowerCase();
                        System.out.println("Toy's category: ");
                        String toyCategory = scanner.nextLine().toLowerCase();
                        System.out.println("Toy's color: ");
                        String color = scanner.nextLine();
                        System.out.println("Toy's quantity: ");
                        int number = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Toy's price: ");
                        int price = scanner.nextInt();
                        toysWarehouse newToy = new toysWarehouse(color, nameOfToys, number, price, toyCategory);
                        wareHouse.addToys(newToy);
                        break;
                    case 2:
                        System.out.println("Removed toy's name: ");
                        String removeName = scanner.nextLine().toLowerCase();
                        wareHouse.removeToys(removeName);
                        break;
                    case 3:
                        System.out.println("Toy's Name: ");
                        String name = scanner.nextLine().toLowerCase();
                        System.out.println("Toy's new number: ");
                        int newNumber = scanner.nextInt();
                        System.out.println("Toy's new price: ");
                        double newPrice = scanner.nextInt();
                        wareHouse.updateNumber(name, newNumber, newPrice);
                        break;
                    case 4:
                        wareHouse.showAllSoftToys();
                        break;
                    case 5:
                        wareHouse.showAllHardToys();
                        break;
                    case 6:
                        wareHouse.showAllToys();
                        break;
                    case 7:
                        exit = true;
                        System.out.println("Log out from the warehouse!");
                        break;
                    default:
                        System.out.println("Wrong choice, try again!");
                }
        }

    }

}

