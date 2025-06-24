package taylorrubi.stellarite.util;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import taylorrubi.stellarite.Stellarite;

import javax.swing.text.html.HTML;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> STELLARITE_ORE_REPLACEABLE = createTag("stellarite_ore_replaceable");
    }
    private static TagKey<Block> createTag(String name) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Stellarite.MOD_ID, name));
    }


}

