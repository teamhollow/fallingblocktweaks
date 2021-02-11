package net.teamhollow.fallingblocktweaks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FallingBlockTweaks implements ModInitializer {
    public static final String MOD_ID = "fallingblocktweaks";
    public static final String MOD_NAME = "Falling Block Tweaks";

    public static final Tag<EntityType<?>> TRIGGER_FALL_ENTITIES_ENTITY_TYPE_TAG = TagRegistry.entityType(new Identifier(FallingBlockTweaks.MOD_ID, "trigger_fall_entities"));

    @Override
    public void onInitialize() {
        Logger.getLogger(MOD_ID).log(Level.INFO, "[" + MOD_NAME + "]" + "Initialized");
    }
}
