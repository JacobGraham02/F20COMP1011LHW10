package JSONExperiments;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;

public class JSONExperiment {
    public static void main(String[] args) throws FileNotFoundException {
        //read the JSON file, we need a "reader"
        try(
            FileReader fileReader = new FileReader("src/JSONExperiments/covid.json");
            JsonReader jsonReader = new JsonReader(fileReader);
        )
        {
            Gson gson = new Gson();
            HighLevelCovidData hlCovidData = gson.fromJson(jsonReader, HighLevelCovidData.class);

            Arrays.asList(hlCovidData.getCountries()).stream()
                            .sorted(Comparator.comparingInt(country -> country.getTotalConfirmed()))
                            .forEach(System.out::println);

        }catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
