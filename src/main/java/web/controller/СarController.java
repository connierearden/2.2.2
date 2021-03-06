package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.model.Car;
import web.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/")
public class СarController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public String printCars(Model model, String name) {
        List<Car> cars = userService.listCarsByCriteria();
/*        cars.add(new Car("bmw", 1234));
        cars.add(new Car("qwerqwer", 213453));
        cars.add(new Car("kjnkjnv", 5436, "old"));*/
        model.addAttribute("cars", cars);
        return "cars";
    }
}
