package de.crxscode.client;

import de.crxscode.client.management.ModuleManager;
import org.lwjgl.opengl.Display;

public class Client {

    private static Client client;

    public static final String NAME = "Client";

    private ModuleManager moduleManager;

    public Client() {
        client = this;
        moduleManager = new ModuleManager();
    }

    public void startClient() {
        Display.setTitle(NAME);
    }

    public static Client getClient() {
        return client;
    }

    public static String getNAME() {
        return NAME;
    }

    public ModuleManager getModuleManager() {
        return moduleManager;
    }
}
