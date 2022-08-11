public class FurnitureItem
{
    int furnitureCode;
    String furnitureType;
    String gradeOfFurniture;
    String color;
    String furnitureUsage;
    double price;

    FurnitureItem()
    {
        furnitureCode = 0;
        furnitureType = "";
        gradeOfFurniture = "";
        color = "";
        furnitureUsage = "";
        price = 0.0;

    }

    public double calculateDiscount(double price)
    {
        double Discount=0;
        if(furnitureUsage=="Outdoors")
        {
            Discount=price*5/100;
        }
        else
        {
            System.out.println("No discount for indoor furniture");
        }
        return Discount;
    }

}
