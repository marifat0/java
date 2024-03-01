package com.rest.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rest.payroll.Mobil;
import com.rest.repository.MobilRepository;

@Configuration
public class LoadDataConfig {
    private static final Logger log = LoggerFactory.getLogger(LoadDataConfig.class);

    @Bean
    CommandLineRunner initDatabase(MobilRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Mobil("BMW", "E-370", "2000")));
            log.info("Preloading " + repository.save(new Mobil("Mercedes", "C-300", "2000")));
        };
    }
}
