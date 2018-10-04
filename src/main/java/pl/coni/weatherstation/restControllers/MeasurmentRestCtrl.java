package pl.coni.weatherstation.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.coni.weatherstation.model.Measurement;
import pl.coni.weatherstation.repositories.MeasurmentRepo;
import pl.coni.weatherstation.services.MeasurmentService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MeasurmentRestCtrl {

    @Autowired
    private MeasurmentRepo measurmentRepo;

    @Autowired
    private MeasurmentService measurmentService;


    @GetMapping("/")
    public List<Measurement> getAllMeasurments() {
        return measurmentRepo.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getOneMeasurment(@PathVariable("id") Long id) {
        Measurement measurement = measurmentRepo.getOne(id);
        if (measurement == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(measurement);
    }

    @GetMapping("/last")
    public Measurement getLastMeasurment() {
        return measurmentRepo.findFirstByOrderByIdDesc();
    }

    @PostMapping("")
    public ResponseEntity<?> addMeasurment(@RequestBody Measurement measurement) {
        Measurement measurement1 = measurmentService.saveMeasurment(measurement);
        return ResponseEntity.ok(measurement1);
    }
}