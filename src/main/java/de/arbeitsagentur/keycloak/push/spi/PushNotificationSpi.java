package de.arbeitsagentur.keycloak.push.spi;

import org.keycloak.provider.Provider;
import org.keycloak.provider.ProviderFactory;
import org.keycloak.provider.Spi;

public class PushNotificationSpi implements Spi {

    @Override
    public boolean isInternal() {
        return false;
    }

    @Override
    public String getName() {
        return "push-notification-sender";
    }

    @Override
    public Class<? extends Provider> getProviderClass() {
        return PushNotificationSender.class;
    }

    @Override
    public Class<? extends ProviderFactory> getProviderFactoryClass() {
        return PushNotificationSenderFactory.class;
    }
}
