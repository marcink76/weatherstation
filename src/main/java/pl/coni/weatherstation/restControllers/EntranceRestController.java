package pl.coni.weatherstation.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.coni.weatherstation.model.Entrance;
import pl.coni.weatherstation.repositories.EntranceRepo;
import pl.coni.weatherstation.services.EntraceService;
import pl.coni.weatherstation.utils.HTTPRequestSender;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/entrance")
public class EntranceRestController {

    @Autowired
    private EntranceRepo entranceRepo;

    @Autowired
    private EntraceService entraceService;

    @Autowired
    private HTTPRequestSender httpRequestSender;

    @GetMapping("/")
    public List<Entrance> getAllEntrances() {
        return entranceRepo.findAll();
    }

    @PostMapping("")
    public ResponseEntity<?> addEntrance(@RequestBody Entrance entrance) {
        System.out.println(entrance.getRfidCardNo() + " " + entrance.getLockerIp());
        try {
            httpRequestSender.httpSender(entrance.getLockerIp(), "unLock");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        Entrance entrance1 = entraceService.saveEntrance(entrance);
        return ResponseEntity.ok(entrance1);
    }
}
