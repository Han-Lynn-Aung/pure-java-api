package org.example;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.jackson.JacksonFeature;

public class AppConfig extends ResourceConfig {
    public AppConfig() {
        // Registering other resource classes
        register(UserResource.class);

        // Registering Jackson for JSON processing
        register(JacksonFeature.class);

        // Other configurations...
    }
}

