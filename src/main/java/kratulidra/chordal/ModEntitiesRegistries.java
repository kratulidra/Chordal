package kratulidra.chordal;

import kratulidra.chordal.ModEntities.AcousticGuitarEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class ModEntitiesRegistries {

    private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
        ResourceKey<EntityType<?>> key = ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(Chordal.MOD_ID, name));
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, key, builder.build(key));
    }

    public static final EntityType<AcousticGuitarEntity> ACOUSTIC_GUITAR = register(
            "acoustic_guitar",
            EntityType.Builder.<AcousticGuitarEntity>of(AcousticGuitarEntity::new, MobCategory.MISC)
                    .sized(0.0f, 0.0f)
    );


    public static void registerModEntityTypes() {
        Chordal.LOGGER.info("Registering EntityTypes for " + Chordal.MOD_ID);
    }

}