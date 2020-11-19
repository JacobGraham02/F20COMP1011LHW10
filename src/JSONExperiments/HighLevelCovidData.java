package JSONExperiments;

import com.google.gson.annotations.SerializedName;

public class HighLevelCovidData {

    @SerializedName("Message")
    private String message;

    @SerializedName("Date")
    private String dateUploaded;

    @SerializedName("Countries")
    private CountryData[] countries;

    public HighLevelCovidData(String message, String dateUploaded, CountryData[] countries) {
        this.message = message;
        this.dateUploaded = dateUploaded;
        this.countries = countries;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(String dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public CountryData[] getCountries() {
        return countries;
    }

    public void setCountries(CountryData[] countries) {
        this.countries = countries;
    }
}
