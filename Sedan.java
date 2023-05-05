public class Sedan extends Car implements Purchase{
    int length;

    @Override
    double getSalePrice() {
        if(this.length > 20){
            return (super.getSalePrice() - (super.getSalePrice() * 0.05));
        }
        else{
            return (super.getSalePrice() - (super.getSalePrice() * 0.1));
        }
    }

    @Override
    public String getPurchaseInfo() {
        return "SEDAN: ";
    }
}
