package fr.mysticraft.mystimod.item.customItems;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

public class RocketWandItem extends Item {
    public RocketWandItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext e) {
        Player p = e.getPlayer();

        assert p != null;
        double x = p.getLookAngle().x;
        double z = p.getLookAngle().z;
        p.knockback(5, x, z);
        e.getItemInHand().hurtAndBreak(1, e.getPlayer(),
                player -> player.broadcastBreakEvent(player.getUsedItemHand()));

        return InteractionResult.SUCCESS;
    }




}
