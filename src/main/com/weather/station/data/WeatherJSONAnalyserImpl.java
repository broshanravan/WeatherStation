package main.com.weather.station.data;

import com.google.gson.Gson;
import main.com.weather.station.beans.MainDetail;
import main.com.weather.station.beans.WeatherReport;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

public class WeatherJSONAnalyserImpl {

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    /**
     * Reading list of weather reports  from
     * the JSON URL
     * @param url
     * @return
     * @throws IOException
     * @throws JSONException
     */
    public  List<WeatherReport> readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        List<WeatherReport> weatherReportList = new LinkedList<WeatherReport>();
        Gson gson = new Gson();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonString = readAll(rd);
            weatherReportList = gson.fromJson(jsonString, List.class);

        }catch(FileNotFoundException fnfe){
        fnfe.printStackTrace();

        }catch (IOException ioe){
            ioe.printStackTrace();
        } finally {
            is.close();
        }

        return weatherReportList;
    }



}
