package com.nyfaria.perfectbirbs;

import com.nyfaria.perfectbirbs.init.EntityInit;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class PerfectBirbs implements ModInitializer {

    @Override
    public void onInitialize() {
        CommonClass.init();
        EntityInit.attributeSuppliers.forEach(
                p -> FabricDefaultAttributeRegistry.register(p.entityTypeSupplier().get(), p.factory().get().build())
        );
    }
}
