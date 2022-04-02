package pl.camp.it.leasing.comparator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.camp.it.leasing.comparator.exceptions.ValidationException;
import pl.camp.it.leasing.comparator.model.Address;
import pl.camp.it.leasing.comparator.services.IOrderService;
import pl.camp.it.leasing.comparator.session.SessionObject;

@Controller
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    IOrderService orderService;

    @Autowired
    SessionObject sessionObject;

    @RequestMapping(value = "/confirm", method = RequestMethod.GET)
    public String confirmOrder(Model model) {
        model.addAttribute("logged", this.sessionObject.isLogged());
        model.addAttribute("address", new Address());
        return "postform";
    }

    @RequestMapping(value = "/confirm", method = RequestMethod.POST)
    public String confirmOrder(@ModelAttribute Address address) {
        try {
              //TODO Validatory

        } catch (ValidationException e) {
            return "redirect:/order/confirm";
        }
        this.orderService.confirmOrder(address);
        return "redirect:/order/orders";
    }


    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public String showOrders(Model model) {
        if (!this.sessionObject.isLogged()) {
            return "redirect:/main";
        }
        model.addAttribute("logged", this.sessionObject.isLogged());
       /* model.addAttribute("cart", this.sessionObject.getCart());
        model.addAttribute("sum", this.sessionObject.getCart().calculateSum());*/
        return "/orders";
    }
}
