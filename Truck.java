public class Truck extends Car implements Purchase{
    int weight;

    @Override
    double getSalePrice() {
        if (this.weight > 2000) {
            return (super.getSalePrice() - (super.getSalePrice() * 0.1));
        } else {
            return super.getSalePrice();
        }
    }

    @Override
    public String getPurchaseInfo() {
        return "TRUCK: ";
    }
}
