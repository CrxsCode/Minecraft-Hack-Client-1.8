package de.crxscode.client.module.modules;

import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.EventTarget;
import de.crxscode.client.event.EventUpdate;
import de.crxscode.client.module.Module;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class Sprint extends Module {

    public Sprint() {
        super("Sprint", Keyboard.KEY_G);
    }

    @EventTarget
    public void onUpdate(EventUpdate eventUpdate) {
        Minecraft.getMinecraft().thePlayer.setSprinting(this.isEnabled());
    }

    @Override
    public void onEnable() {
        EventManager.register(this);
        super.onEnable();
    }

    @Override
    public void onDisable() {
        EventManager.unregister(this);
        super.onDisable();
    }
}
