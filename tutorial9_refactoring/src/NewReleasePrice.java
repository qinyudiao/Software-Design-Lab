public class NewReleasePrice extends Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    //determine amounts for each line
    @Override
    double getCharge(int daysRented) {
        //determine amounts for each line
        double result = daysRented * 3;
        return result;
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        if (daysRented > 1)
            return 2;
        return 1;
    }
}
