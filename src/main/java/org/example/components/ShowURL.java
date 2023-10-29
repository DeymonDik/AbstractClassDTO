package org.example.components;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.SwaggerUiConfigParameters;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.net.InetAddress;
import java.net.URI;
import java.util.Arrays;

@Component
@Slf4j
@AllArgsConstructor
public class ShowURL implements ApplicationListener<ApplicationReadyEvent> {

    private SwaggerUiConfigParameters swaggerUiConfigParameters;
    private ServerProperties serverProperties;
    private AnnotationConfigServletWebServerApplicationContext context;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        try {

            String scheme = serverProperties.getSsl() != null && serverProperties.getSsl().isEnabled()
                    ? "https" : "http";

            String host = (serverProperties.getAddress() == null
                    ? InetAddress.getLocalHost() : serverProperties.getAddress())
                    .getHostAddress();

            int port = context.getWebServer().getPort();

            String path = swaggerUiConfigParameters.getPath();

            URI uri = new URI(scheme,
                    null,
                    host,
                    port,
                    path,
                    null,
                    null);

            System.setProperty("java.awt.headless", "false");
            Desktop.getDesktop().browse(uri);

        } catch (Exception e) {
            log.error(Arrays.toString(e.getStackTrace()));
        } finally {
            System.setProperty("java.awt.headless", "true");
        }
    }
}
