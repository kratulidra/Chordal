package kratulidra.chordal.ModItems;

import kratulidra.chordal.ModEntities.AcousticGuitarEntity;
import kratulidra.chordal.ModEntitiesRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector3d;

public class AcousticGuitar extends Item {
    public AcousticGuitar(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(Level level, Player user, InteractionHand hand) {
        if (level.isClientSide()) {return InteractionResult.PASS;}
        if (!user.onGround()){return InteractionResult.PASS;}

        double p_x = user.getX();
        double p_y = user.getY();
        double p_z = user.getZ();
        AcousticGuitarEntity acousticGuitar = new AcousticGuitarEntity(ModEntitiesRegistries.ACOUSTIC_GUITAR,level);
        acousticGuitar.setPos(new Vec3(p_x,p_y+1,p_z));
        level.addFreshEntity(acousticGuitar);
        user.startRiding(acousticGuitar);

        return InteractionResult.SUCCESS;
    }


}
