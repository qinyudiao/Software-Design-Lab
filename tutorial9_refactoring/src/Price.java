public abstract class Price {
    public abstract int getPriceCode();
    //determine amounts for each line
    abstract double getCharge(int daysRented);

    abstract int getFrequentRenterPoints(int daysRented);
}
