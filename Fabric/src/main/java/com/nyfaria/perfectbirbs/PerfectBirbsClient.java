package com.nyfaria.perfectbirbs;

import com.nyfaria.perfectbirbs.init.BlockInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class PerfectBirbsClient implements ClientModInitializer {
    
    @Override
    public void onInitializeClient() {
        BlockInit.plushieBlocks.forEach(block -> {
            BlockRenderLayerMap.INSTANCE.putBlock(block.get(), RenderType.cutout());
        });
    }
}
