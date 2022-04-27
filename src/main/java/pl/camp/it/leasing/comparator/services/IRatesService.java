package pl.camp.it.leasing.comparator.services;

import org.json.simple.parser.ParseException;

import java.io.IOException;

public interface IRatesService {
    double getChfValue() throws IOException, ParseException;
}
