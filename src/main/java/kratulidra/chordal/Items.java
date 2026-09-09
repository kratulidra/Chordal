package kratulidra.chordal;

import kratulidra.chordal.ModItems.AcousticGuitar;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class Items {
    public static final Item ACOUSTIC_GUITAR = ModItemsFunctions.register(ModItemsFunctions.ACOUSTIC_GUITAR, AcousticGuitar::new, new Item.Properties().stacksTo(1));

    public static void initialize(){

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((creativeTab) -> creativeTab.accept(Items.ACOUSTIC_GUITAR));


    }
}
