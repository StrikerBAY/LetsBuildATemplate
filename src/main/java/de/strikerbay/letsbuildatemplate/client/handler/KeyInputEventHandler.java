package de.strikerbay.letsbuildatemplate.client.handler;


import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import de.strikerbay.letsbuildatemplate.client.settings.Keybindings;
import de.strikerbay.letsbuildatemplate.reference.Key;
import de.strikerbay.letsbuildatemplate.utility.LogHelper;

public class KeyInputEventHandler {

    private static Key getPressedKeybinding()
    {
        if (Keybindings.charge.isPressed())
        {
            return Key.CHARGE;
        }
        else if (Keybindings.release.isPressed())
        {
            return Key.RELEASE;
        }

        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        LogHelper.info(getPressedKeybinding());
    }

}
