package org.example.components;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.net.URI;
import java.util.Arrays;

@Component
@Slf4j
@Setter
public class ShowURL implements ApplicationListener<ApplicationReadyEvent> {

    @Value("${url}")
    private String url;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        try {
            System.setProperty("java.awt.headless", "false");
            Desktop.getDesktop().browse(new URI(url));
        } catch (Exception e) {
            log.error(Arrays.toString(e.getStackTrace()));
        } finally {
            System.setProperty("java.awt.headless", "true");
        }
    }
}
