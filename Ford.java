public class Ford extends Car implements Purchase{
    int year;
    int manufacturerDiscount;

    @Override
    double getSalePrice() {
        return (super.getSalePrice() - this.manufacturerDiscount);
    }

    @Override
    public String getPurchaseInfo() {
        return "FORD: ";
    }
}
