package pl.camp.it.leasing.comparator.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.camp.it.leasing.comparator.model.Car;
import pl.camp.it.leasing.comparator.model.ItemValue;
import pl.camp.it.leasing.comparator.model.Time;

@RestController
public class RLeasingController {

    @RequestMapping (value = "/endpoint", method = RequestMethod.POST)
    public Time endPoint(@RequestBody Time time, @RequestBody ItemValue itemValue, @RequestBody Car car) {
        System.out.println(time.getCode());
        System.out.println(time.getOwnContribution());
        System.out.println(itemValue.getValue());

        return time;
    }
}
