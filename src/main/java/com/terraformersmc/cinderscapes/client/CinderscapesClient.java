package com.terraformersmc.cinderscapes.client;

import com.terraformersmc.cinderscapes.init.CinderscapesBlocks;
import com.terraformersmc.terraform.block.TerraformSignBlock;
import com.terraformersmc.terraform.registry.SpriteIdentifierRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.util.SpriteIdentifier;

/**
 * [REVIEWED]
 *
 * @author <Wtoll> Will Toll on 2020-05-02
 * @project Cinderscapes
 */
@SuppressWarnings("unused")
@Environment(EnvType.CLIENT)
public class CinderscapesClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // TODO: Find a more elegant way to add blocks to their render layers

        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(),
                CinderscapesBlocks.UMBRAL_WART_BLOCK,
                CinderscapesBlocks.CRYSTALLINE_SULFUR_QUARTZ,
                CinderscapesBlocks.CRYSTALLINE_QUARTZ,
                CinderscapesBlocks.CRYSTALLINE_ROSE_QUARTZ,
                CinderscapesBlocks.CRYSTALLINE_SMOKY_QUARTZ,
                CinderscapesBlocks.POLYPITE_ROSE_QUARTZ,
                CinderscapesBlocks.POLYPITE_QUARTZ,
                CinderscapesBlocks.POLYPITE_SMOKY_QUARTZ,
                CinderscapesBlocks.POLYPITE_SULFUR_QUARTZ,
                CinderscapesBlocks.GHASTLY_ECTOPLASM
        );
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                CinderscapesBlocks.PHOTOFERN,
                CinderscapesBlocks.TALL_PHOTOFERN,
                CinderscapesBlocks.LUMINOUS_POD,
                CinderscapesBlocks.TWILIGHT_FESCUES,
                CinderscapesBlocks.TWILIGHT_TENDRILS,
                CinderscapesBlocks.UMBRAL_FUNGUS,
                CinderscapesBlocks.SCORCHED_SHRUB,
                CinderscapesBlocks.SCORCHED_SPROUTS,
                CinderscapesBlocks.BRAMBLE_BERRY_BUSH,
                CinderscapesBlocks.PYRACINTH,
                CinderscapesBlocks.CRYSTINIUM,
                CinderscapesBlocks.SCORCHED_TENDRILS,
                CinderscapesBlocks.UMBRAL_DOOR
        );

        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ((TerraformSignBlock) CinderscapesBlocks.UMBRAL_SIGN).getTexture()));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, ((TerraformSignBlock) CinderscapesBlocks.SCORCHED_SIGN).getTexture()));
    }
}
