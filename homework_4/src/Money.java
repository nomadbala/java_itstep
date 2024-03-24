public class Money {
    private int dollars;

    private int cents;

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public int getDollars() {
        return dollars;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public int getCents() {
        return cents;
    }

    public void setCents(int cents) {
        this.cents = cents;
    }

    public void showBalance() {
        System.out.println(dollars + "." + cents);
    }

    public void setAmount(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public void reduceAmount(int reductionDollars, int reductionCents) {
        int totalCents = dollars * 100 + cents;
        int reductionTotalCents = reductionDollars * 100 + reductionCents;
        int remainingCents = totalCents - reductionTotalCents;

        if (remainingCents >= 0) {
            dollars = remainingCents / 100;
            cents = remainingCents % 100;
        }
    }
}
