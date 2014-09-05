package de.strikerbay.letsbuildatemplate.client.settings;


import de.strikerbay.letsbuildatemplate.reference.Names;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class Keybindings {

    public static KeyBinding charge = new KeyBinding(Names.Keys.CHARGE, Keyboard.KEY_K, Names.Keys.CATEGORY);
    public static KeyBinding release = new KeyBinding(Names.Keys.RELEASE, Keyboard.KEY_I, Names.Keys.CATEGORY);

}
