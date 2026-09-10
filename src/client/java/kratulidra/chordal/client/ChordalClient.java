package kratulidra.chordal.client;

import kratulidra.chordal.ModEntities.AcousticGuitarEntity;
import kratulidra.chordal.ModEntitiesRegistries;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.NoopRenderer;

public class ChordalClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		EntityRenderers.register(ModEntitiesRegistries.ACOUSTIC_GUITAR, NoopRenderer::new);
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
	}
}