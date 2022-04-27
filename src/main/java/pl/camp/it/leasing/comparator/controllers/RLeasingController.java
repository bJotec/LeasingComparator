package pl.camp.it.leasing.comparator.controllers;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.camp.it.leasing.comparator.model.Car;
import pl.camp.it.leasing.comparator.model.ItemValue;
import pl.camp.it.leasing.comparator.model.Time;
import pl.camp.it.leasing.comparator.model.dto.LeasingDTO;
import pl.camp.it.leasing.comparator.services.ILeasingService;
import pl.camp.it.leasing.comparator.services.IRatesService;

import java.io.IOException;

@RestController
public class RLeasingController {

    @Autowired
    ILeasingService leasingService;

    @Autowired
    IRatesService ratesService;

    @RequestMapping (value = "/endpoint", method = RequestMethod.POST)
    public Time endPoint(@RequestBody LeasingDTO leasingDTO) throws IOException, ParseException {
        System.out.println(leasingDTO.getLenght());
        System.out.println(leasingDTO.getWklad());
        System.out.println(leasingDTO.getCar());
        System.out.println(leasingDTO.isCheck());

      /*  System.out.println(ratesService.getChfValue());*/

        Time time = new Time();
        time.setTimePeriod(12);

        time.setCalculateLeasing(this.leasingService.calculate(leasingDTO.getLenght(),leasingDTO.getWklad(),leasingDTO.getCar()));

        time.setConvertRate(this.leasingService.rateConvert(time.getCalculateLeasing(), ratesService.getChfValue()));
        System.out.println(time.getConvertRate());

        return time;
    }
}
