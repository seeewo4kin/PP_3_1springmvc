package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
    private CarService carService;

    @Autowired
    public CarConroller(CarService carService) {
        this.carService = carService;
    }
    @GetMapping(value = "/cars")
    public String carsPage(@RequestParam(value = "count", required = false,
                defaultValue = "5") Integer count, Model model) {
        
        model.addAttribute("cars", carService.getCars(count));

        return "cars";
    }
}
