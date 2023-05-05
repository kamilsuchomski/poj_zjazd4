public class AutoShop {
    public static void main(String[] args) {

        Sedan sedanObj1 = new Sedan();
        sedanObj1.speed = 110;
        sedanObj1.regularPrice = 59999.99;
        sedanObj1.color = "orange";

        sedanObj1.length = 25;

        Ford fordObj1 = new Ford();
        fordObj1.speed = 78;
        fordObj1.regularPrice = 39999.99;
        fordObj1.color = "blue";

        fordObj1.year = 2015;
        fordObj1.manufacturerDiscount = 5000;

        Ford fordObj2 = new Ford();
        fordObj2.speed = 159;
        fordObj2.regularPrice = 85789.99;
        fordObj2.color = "red";

        fordObj2.year = 2022;
        fordObj2.manufacturerDiscount = 15789;

        Truck truckObj1 = new Truck();
        truckObj1.speed = 68;
        truckObj1.regularPrice = 120000;
        truckObj1.color = "green";

        truckObj1.weight = 2980;


        System.out.println(sedanObj1.getPurchaseInfo() + sedanObj1.getSalePrice());
        System.out.println(fordObj1.getPurchaseInfo() + fordObj1.getSalePrice());
        System.out.println(fordObj2.getPurchaseInfo() + fordObj2.getSalePrice());
        System.out.println(truckObj1.getPurchaseInfo() + truckObj1.getSalePrice());
    }
}
