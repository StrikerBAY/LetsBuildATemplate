package de.strikerbay.letsbuildatemplate;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.strikerbay.letsbuildatemplate.handler.ConfigurationHandler;
import de.strikerbay.letsbuildatemplate.proxy.IProxy;
import de.strikerbay.letsbuildatemplate.reference.Reference;
import de.strikerbay.letsbuildatemplate.utility.LogHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME,version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsBuildATemplate {


    @Mod.Instance(Reference.MOD_ID)
    public static LetsBuildATemplate instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;



    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("PRE ist durch .........................................");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        LogHelper.info("INIT ist durch .........................................");

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        LogHelper.info("POST ist durch .........................................");

    }
}
