package pl.camp.it.leasing.comparator.controllers;

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

@RestController
public class RLeasingController {

    @Autowired
    ILeasingService leasingService;

    @RequestMapping (value = "/endpoint", method = RequestMethod.POST)
    public Time endPoint(@RequestBody LeasingDTO leasingDTO) {
        System.out.println(leasingDTO.getLenght());
        System.out.println(leasingDTO.getWklad());
        System.out.println(leasingDTO.getCar());
        System.out.println(leasingDTO.isCheck());

        Time time = new Time();
        time.setTimePeriod(12);

        time.setCalculateLeasing(this.leasingService.calculate(leasingDTO.getLenght(),leasingDTO.getWklad(),leasingDTO.getCar()));


        return time;
    }
}
