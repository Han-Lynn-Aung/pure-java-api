package org.example;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class Main {
    public static void main(String[] args) {
        URI baseUri = UriBuilder.fromUri("http://localhost/").port(8080).build();
        ResourceConfig config = new ResourceConfig(UserResource.class);
        config.property(ServerProperties.JSON_PROCESSING_FEATURE_DISABLE, false);

        GrizzlyHttpServerFactory.createHttpServer(baseUri, config);
        System.out.println("Server started at " + baseUri + "\nPress Ctrl + C to stop.");
    }
}