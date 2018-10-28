package pl.coni.weatherstation.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.coni.weatherstation.model.Entrance;
import pl.coni.weatherstation.repositories.EntranceRepo;
import pl.coni.weatherstation.services.EntraceService;

import java.util.List;

@RestController
@RequestMapping("api/entrance")
public class EntranceRestController {

    @Autowired
    private EntranceRepo entranceRepo;

    @Autowired
    private EntraceService entraceService;

    @GetMapping("/")
    public List<Entrance> getAllEntrances() {
        return entranceRepo.findAll();
    }

    @PostMapping("")
    public ResponseEntity<?> addEntrance(@RequestBody Entrance entrance) {
        System.out.println(entrance.getRfidCardNo());
        Entrance entrance1 = entraceService.saveEntrance(entrance);
        return ResponseEntity.ok(entrance1);
    }
}
