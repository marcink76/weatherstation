package pl.coni.weatherstation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coni.weatherstation.model.RfidCard;
import pl.coni.weatherstation.repositories.RfidCardRepo;

import java.util.List;

@Service
public class RfidCardService {

    @Autowired
    private RfidCardRepo rfidCardRepo;

    public List<RfidCard> getAllRfidCards() {
        return rfidCardRepo.findAll();
    }

}
