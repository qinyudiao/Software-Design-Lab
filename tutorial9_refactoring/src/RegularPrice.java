public class RegularPrice extends Price {
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    //determine amounts for each line
    @Override
    double getCharge(int daysRented) {
        //determine amounts for each line
        double result = 0;
        result += 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}