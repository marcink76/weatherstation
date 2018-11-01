package pl.coni.weatherstation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coni.weatherstation.model.RfidCard;

@Repository
public interface RfidCardRepo extends JpaRepository<RfidCard, Long> {
}
