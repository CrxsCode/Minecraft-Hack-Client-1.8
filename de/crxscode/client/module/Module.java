package de.crxscode.client.module;

public class Module {

    private String name;
    private int keybind;
    private boolean isEnabled;

    public Module(String name, int keybind) {
        this.name = name;
        this.keybind = keybind;
        this.isEnabled = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKeybind() {
        return keybind;
    }

    public void setKeybind(int keybind) {
        this.keybind = keybind;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        if (enabled) {
            this.onEnable();
        } else {
            this.onDisable();
        }
        isEnabled = enabled;
    }

    public void toggle() {
        this.setEnabled(!this.isEnabled());
    }

    public void onEnable() {

    }

    public void onDisable() {

    }
}
