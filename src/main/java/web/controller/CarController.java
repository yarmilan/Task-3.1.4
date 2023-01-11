package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

import java.util.Optional;

@Controller
public class CarController {

    CarServiceImpl carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(name = "count", required = false) Optional<Integer> count, ModelMap model) {
        model.addAttribute("cars", carService.getCars(count.orElse(0)).toString());
        return "cars";
    }
}
