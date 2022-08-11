import java.util.Scanner;

public class FurnitureItemImpl
{
    public static void main(String[] args)
    {
        FurnitureItem f1=new FurnitureItem();
        Scanner scanner=new Scanner(System.in);

        /*f1.furnitureCode=0;
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

        System.out.println("Discount = " +f1.calculateDiscount()); */


        System.out.println("Enter the type of furniture");
        f1.furnitureType=scanner.nextLine();
        System.out.println("Product code is 1234");
        System.out.println("Enter the usage of furniture");
        f1.furnitureUsage=scanner.nextLine();
        System.out.println("Enter the color ");
        f1.color=scanner.nextLine();
        System.out.println("Enter the grade ");
        f1.gradeOfFurniture= scanner.nextInt();
        System.out.println("Price of product is 600");

        if(f1.furnitureUsage.equals("outdoor"))
        {
            double prices=f1.calculateDiscount();
            System.out.println("Price after Discount is " +prices);
        }
        else
        {
            System.out.println("NO discount");
        }

    }

}
