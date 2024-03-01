package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.payroll.Mobil;

public interface MobilRepository extends JpaRepository<Mobil, Long> {
    
}
