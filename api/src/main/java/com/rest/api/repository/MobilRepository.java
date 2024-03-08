package com.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rest.api.model.Mobil;
import java.util.List;
import java.util.Optional;


public interface MobilRepository extends JpaRepository<Mobil, Long> {
    List<Mobil> findByMerk(String merk);
    List<Mobil> findByType(String type);
    Optional<Mobil> findById(Long id);
}
