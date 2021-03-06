package pl.coni.weatherstation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coni.weatherstation.model.Measurement;
import pl.coni.weatherstation.repositories.MeasurmentRepo;

import java.util.List;

@Controller
@RequestMapping("measurments")
public class MeasurmentCtrl {

    @Autowired
    private MeasurmentRepo measurmentRepo;

    @GetMapping("/all")
    public String getAllMeasurments(Model model) {
        List<Measurement> measurementList = measurmentRepo.findAll();
        model.addAttribute("maxTemp", measurmentRepo.maxTemperature());
        model.addAttribute("maxHumidity", measurmentRepo.maxHumidity());
        model.addAttribute("maxPressure", measurmentRepo.maxPressure());
        model.addAttribute("minTemp", measurmentRepo.minTemperature());
        model.addAttribute("minHumidity", measurmentRepo.minHumidity());
        model.addAttribute("minPressure", measurmentRepo.minPressure());
        model.addAttribute("avarageTemp", measurmentRepo.avarageTemperature());
        model.addAttribute("avarageHumidity", measurmentRepo.avarageHumidity());
        model.addAttribute("avaragePressure", measurmentRepo.avaragePressure());
        model.addAttribute("measurments", measurementList);
        return "measurments";
    }

    @GetMapping("/last")
    public String getLatMeasurment(Model model) {
        model.addAttribute("lastMeasurment", measurmentRepo.findFirstByOrderByIdDesc());
        return "lastMeasurment";
    }

}
