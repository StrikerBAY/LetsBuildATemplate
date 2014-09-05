package de.strikerbay.letsbuildatemplate.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import de.strikerbay.letsbuildatemplate.client.settings.Keybindings;
import net.minecraft.client.settings.KeyBinding;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerKeyBindings() {

        ClientRegistry.registerKeyBinding(Keybindings.charge);
        ClientRegistry.registerKeyBinding(Keybindings.release);

    }

}
