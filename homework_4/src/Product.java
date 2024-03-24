public class Product {
    private String name;
    private Money price;

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.print("Product: " + name + ", ");
        price.showBalance();
    }

    public void reducePrice(int reductionDollars, int reductionCents) {
        price.reduceAmount(reductionDollars, reductionCents);
    }
}
