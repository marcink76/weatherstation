package pl.coni.weatherstation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coni.weatherstation.model.Entrance;

@Repository
public interface EntranceRepo extends JpaRepository<Entrance, Long> {

}
