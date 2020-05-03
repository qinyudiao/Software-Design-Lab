import util.DataRange;

class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, DataRange dataRange) {
        _movie = movie;
        _daysRented = (int)((dataRange.getEnd().getTime() - dataRange.getStart().getTime()) / (1000 * 60 * 60 * 24));
    }

    public int getDaysRented() {
        return _daysRented;
    }
    public String getTitle() {
        return _movie.getTitle();
    }
    public int getPriceCode() {
        return _movie.getPriceCode();
    }
    public Movie getMovie() { return _movie; }

    public void setDaysRented(int daysRented) { _daysRented = daysRented; }
    public void setTitle(String title) { _movie.setTitle(title); }
    public void setPriceCode(int priceCode) { _movie.setPriceCode(priceCode); }
    public void setMovie(Movie movie) { _movie = movie; }

    public double getCharge() {
        return _movie.getCharge(_daysRented);
    }

    public double getFrequentRenterPoints() {
        return _movie.getFrequentRenterPoints(_daysRented);
    }
}
