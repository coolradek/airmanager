package pl.kapalka.airmanager.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kapalka.airmanager.entities.Compressor;

@Repository
public interface CompressorRepository extends CrudRepository<Compressor, Long> {

}
