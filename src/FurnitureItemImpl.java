public class FurnitureItemImpl
{
    public static void main(String[] args)
    {
        FurnitureItem f1=new FurnitureItem();
        display(f1);

    }
    public static void display(FurnitureItem object)
    {
        System.out.println("FurnitureCode = " +object.furnitureCode);
        System.out.println("FurnitureType = " +object.furnitureType);
        System.out.println("FurnitureGrade = " +object.gradeOfFurniture);
        System.out.println("FurnitureColor = " +object.color);
        System.out.println("FurnitureUsage = " +object.furnitureUsage);
        System.out.println("FurniturePrice = " +object.price);
    }

}
