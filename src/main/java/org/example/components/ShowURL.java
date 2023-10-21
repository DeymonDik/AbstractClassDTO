package org.example.components;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Setter
public class ShowURL implements ApplicationListener<ApplicationReadyEvent> {

    @Value("${url}")
    private String url;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        log.info("Графический интерфейс пользователя: {}", url);
    }
}
