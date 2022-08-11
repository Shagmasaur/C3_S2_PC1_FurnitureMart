import java.util.Scanner;

public class FurnitureItemImpl
{
    public static void main(String[] args)
    {
        FurnitureItem f1=new FurnitureItem();

        f1.furnitureCode=0;
        f1.furnitureType="Stools";
        f1.furnitureUsage="Outdoor";
        f1.color="Color";
        f1.gradeOfFurniture=1;
        f1.price=600;



        System.out.println("FurnitureCode = " +f1.furnitureCode);
        System.out.println("FurnitureType = " +f1.furnitureType);
        System.out.println("FurnitureGrade = " +f1.gradeOfFurniture);
        System.out.println("FurnitureColor = " +f1.color);
        System.out.println("FurnitureUsage = " +f1.furnitureUsage);
        System.out.println("FurniturePrice = " +f1.price);

        System.out.println("Discount = " +f1.calculateDiscount());
    }

}
