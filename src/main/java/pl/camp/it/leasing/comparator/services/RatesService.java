package pl.camp.it.leasing.comparator.services;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

@Service
public class RatesService implements IRatesService{

    public double getChfValue() throws IOException, ParseException {

        URL url = new URL("http://api.nbp.pl/api/exchangerates/rates/a/chf/");
        URLConnection urlcon = url.openConnection();
        InputStream input = urlcon.getInputStream();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(input));

        JSONObject exchangerates = (JSONObject) new JSONParser().parse(buffer);
        JSONArray rates = (JSONArray) exchangerates.get("rates");

        Double mid = null;
        for (Object obj : rates) {
            JSONObject x1 = (JSONObject) obj;
            mid = (Double) x1.get("mid");
        }

        /*System.out.println(mid);*/
        return mid;
    }
}
