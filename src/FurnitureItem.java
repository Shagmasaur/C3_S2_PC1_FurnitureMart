public class FurnitureItem
{
    int furnitureCode;
    String furnitureType;
    int gradeOfFurniture;
    String color;
    String furnitureUsage;
    double price;

    FurnitureItem()
    {
        furnitureCode = 0;
        furnitureType = "";
        gradeOfFurniture = 0;
        color = "";
        furnitureUsage = "";
        price = 600.0;

    }

    public double calculateDiscount()
    {
        return price-0.05*price;
    }

}
