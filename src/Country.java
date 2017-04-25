/**
 * Created by broadwells on 4/24/17.
 */
public class Country {
    private String countryName;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString(){
        return countryName;
    }
}
