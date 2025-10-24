package com.jasper.learn.config;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class FlywayConfig {

    private final Flyway flyway;

    @PostConstruct
    public void migrateOnStartup() {
        flyway.migrate();
        log.info("Flyway migration completed successfully.");
    }

}
