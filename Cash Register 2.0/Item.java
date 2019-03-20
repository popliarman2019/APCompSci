public class Item {

    String name;

    int code;

    double price;

    int inventory;

    String type;

    public Item(String newName, int newCode, double newPrice, int newInventory, String newType) {

        name = newName;
        code = newCode;
        price = newPrice;
        inventory = newInventory;
        type = newType;

        System.out.printf("%d units of %s, are priced at %.2f, and are in our %s department.\n",inventory,name,price,type);
    }
}