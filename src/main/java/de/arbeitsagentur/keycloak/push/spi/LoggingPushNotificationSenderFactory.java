package de.arbeitsagentur.keycloak.push.spi;

import org.keycloak.Config;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

public class LoggingPushNotificationSenderFactory implements PushNotificationSenderFactory {

    public static final String ID = "log";

    @Override
    public PushNotificationSender create(KeycloakSession session) {
        return new LoggingPushNotificationSender();
    }

    @Override
    public void init(Config.Scope config) {
        // no-op
    }

    @Override
    public void postInit(KeycloakSessionFactory factory) {
        // no-op
    }

    @Override
    public void close() {
        // no-op
    }

    @Override
    public String getId() {
        return ID;
    }
}
