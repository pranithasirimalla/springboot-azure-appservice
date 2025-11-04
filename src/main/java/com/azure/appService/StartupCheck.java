package com.azure.appService;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartupCheck {

    private final DataSource dataSource;

    public StartupCheck(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void checkConnection() throws Exception {
        try (Connection conn = dataSource.getConnection()) {
            System.out.println("✅ Connected to DB: " + conn.getCatalog());
        }
    }
}
