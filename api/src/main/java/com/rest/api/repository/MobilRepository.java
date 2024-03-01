package com.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rest.api.model.Mobil;

public interface MobilRepository extends JpaRepository<Mobil, Long> {
    
}
