public class toysWarehouse {
    String color;
    String nameOfToy;
    int numberOfToys;
    double price;
    String category;
    public toysWarehouse(String color, String nameOfToy,int numberOfToys,double price, String category){
        this.color = color;
        this.nameOfToy = nameOfToy;
        this.numberOfToys = numberOfToys;
        this.price = price;
        this.category = category;
    }
    public String getNameOfToy() {
        return nameOfToy.substring(0, 1).toUpperCase()+nameOfToy.substring(1).toLowerCase();
    }

    public String getCategory() {
        return category;
    }


    public void updateToysData(int newNumber, double newPrice){
        this.numberOfToys = newNumber;
        this.price = newPrice;
    }
    public void showToyInfo(){
        System.out.println("Name: "+nameOfToy.substring(0,1).toUpperCase()+nameOfToy.substring(1).toLowerCase());
        System.out.println("Category: "+category.toLowerCase());
        System.out.println("Color: "+color.substring(0,1).toUpperCase()+color.substring(1).toLowerCase());
        System.out.println("Quantity: "+numberOfToys);
        System.out.println("Price: "+price+"$");

    }
}
