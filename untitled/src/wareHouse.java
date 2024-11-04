import java.util.ArrayList;

public class wareHouse {
    public ArrayList<toysWarehouse> toys;

    public wareHouse() {
        toys = new ArrayList<>();
    }


    public void addToys(toysWarehouse toy) {
        toys.add(toy);
        System.out.println(toy.getNameOfToy() + "-added to warehouse!");
    }

    public void removeToys(String nameOfToys) {
        for (int i = 0; i < toys.size(); i++) {
            if (toys.get(i).getNameOfToy().equalsIgnoreCase(nameOfToys)) {
                toys.remove(i);
                System.out.println(nameOfToys.substring(0, 1).toUpperCase() + nameOfToys.substring(1).toLowerCase() + "-deleted from warehouse!");
                return;
            }

        }
        System.out.println("No found in warehouse!");
    }

    public void showAllSoftToys() {
        for (int i = 0; i < toys.size(); i++) {
            if (toys.get(i).getCategory().equalsIgnoreCase("soft")) {
                System.out.println("----------------------");
                toys.get(i).showToyInfo();
                System.out.println("----------------------");

            }

        }
    }
    public void showAllHardToys() {
        for (int i = 0; i < toys.size(); i++) {
            if (toys.get(i).getCategory().equalsIgnoreCase("hard")) {
                System.out.println("----------------------");
                toys.get(i).showToyInfo();
                System.out.println("----------------------");

            }

        }
    }

    public void updateNumber(String nameOfToys, int newNumber, double newPrice) {
        for (toysWarehouse toy : toys) {
            if (toy.getNameOfToy().equalsIgnoreCase(nameOfToys)) {
                toy.updateToysData(newNumber, newPrice);
                System.out.println("Toy's updated quantity: " + newNumber);
                System.out.println("Toy's updated price: " + newPrice + "$");
                return;

            }
        }
        System.out.println(nameOfToys + "No found in warehouse!");

    }

    public void showAllToys() {
        if (toys.isEmpty()) {
            System.out.println("No pupils at school");
        } else {
            for (toysWarehouse toy : toys) {
                System.out.println("----------------------");
                toy.showToyInfo();
                System.out.println("----------------------");
            }
        }
    }


}
