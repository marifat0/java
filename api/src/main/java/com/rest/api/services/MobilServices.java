package com.rest.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rest.api.model.Mobil;
import com.rest.api.repository.MobilRepository;

@Service
@Transactional
public class MobilServices {

    @Autowired
    MobilRepository mobilRepository;

    public Mobil getMobilById(Long Id) {
        // Looking for mobil's id
        Mobil mobil = mobilRepository.getReferenceById(Id);
        return mobil;
    }

}
