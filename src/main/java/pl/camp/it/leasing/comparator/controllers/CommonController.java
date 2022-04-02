package pl.camp.it.leasing.comparator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.camp.it.leasing.comparator.model.Time;
import pl.camp.it.leasing.comparator.model.dto.LeasingDTO;
import pl.camp.it.leasing.comparator.services.ILeasingService;
import pl.camp.it.leasing.comparator.session.SessionObject;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CommonController {

    @Resource
    SessionObject sessionObject;

    @Autowired
    ILeasingService leasingService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main() {
        return ("redirect:/main");
    }

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(Model model) {
        model.addAttribute("logged", this.sessionObject.isLogged());
        return "main";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contact(Model model) {
        model.addAttribute("logged", this.sessionObject.isLogged());
        return "contact";
    }

    @RequestMapping(value = "/leasing", method = RequestMethod.GET)
    public String leasing(Model model ) {
        model.addAttribute("time", this.leasingService.getTime());
        model.addAttribute("logged", this.sessionObject.isLogged());
        model.addAttribute("car", this.leasingService.getCar());

        return "leasing";
    }


    @RequestMapping(value = "/leasing", method = RequestMethod.POST)
    public String leasing(@RequestParam(required = false, defaultValue = "false") boolean isPresent,
                          @RequestParam int period,
                          @RequestParam int ownContribution,
                          @RequestParam double car) {
        System.out.println(isPresent);
        System.out.println(period);
        System.out.println(ownContribution);
        System.out.println(car);
        this.leasingService.calculate(period,ownContribution,car);
        return "redirect:/leasing";
    }


    @RequestMapping(value = "/najem", method = RequestMethod.GET)
    public String najem(Model model) {
        model.addAttribute("logged", this.sessionObject.isLogged());
        return "najem";
    }


}
