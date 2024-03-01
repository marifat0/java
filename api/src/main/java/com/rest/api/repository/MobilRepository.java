package com.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.api.payroll.Mobil;

public interface MobilRepository extends JpaRepository<Mobil, Long> {
    
}
