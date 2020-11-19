package JSONExperiments;

import com.google.gson.annotations.SerializedName;

public class CountryData {

    @SerializedName("Country")
    private String country;

    @SerializedName("TotalConfirmed")
    private int totalConfirmed;

    @SerializedName("TotalDeaths")
    private int totalDeaths;

    @SerializedName("TotalRecovered")
    private int totalRecovered;

    public CountryData(String country, int totalConfirmed, int totalDeaths, int totalRecovered) {
        this.country = country;
        this.totalConfirmed = totalConfirmed;
        this.totalDeaths = totalDeaths;
        this.totalRecovered = totalRecovered;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getTotalConfirmed() {
        return totalConfirmed;
    }

    public void setTotalConfirmed(int totalConfirmed) {
        this.totalConfirmed = totalConfirmed;
    }

    public int getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(int totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public int getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(int totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public String toString()
    {
        return String.format("%-35s %8d %8d %8d", country,totalConfirmed, totalDeaths, totalRecovered);
    }
}
