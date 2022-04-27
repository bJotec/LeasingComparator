package pl.camp.it.leasing.comparator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import pl.camp.it.leasing.comparator.model.Time;
import pl.camp.it.leasing.comparator.model.dto.LeasingDTO;
import pl.camp.it.leasing.comparator.services.ILeasingService;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "/currencies")
@RestController
public class RCurrencyController {


  /*  @Autowired*/
    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/chf")
    public Double getCurrencyCHF() {

        Double chf = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/a/chf/", Double.class, new HashMap<>());
        return chf;
    }

/*

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}") //where {from} and {to} represents the column
//returns a bean back
    public CurrencyConversionBeanconvertCurrency(@PathVariable String from, @PathVariable String to, @PathVariableBigDecimal quantity)
    {
//setting variables to currency exchange service
        Map<String, String> uriVariables=new HashMap<>();
        uriVariables.put("from", from);
        uriVariables.put("to", to);
//calling the currency-exchange-service
        ResponseEntity<CurrencyConversionBean>responseEntity=new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class, uriVariables);
        CurrencyConversionBean response=responseEntity.getBody();
//creating a new response bean and getting the response back and taking it into Bean
        return new CurrencyConversionBean(response.getId(), from,to,response.getConversionMultiple(), quantity,quantity.multiply(response.getConversionMultiple()),response.getPort());
    }*/
}
