package fr.mysticraft.mystimod.item.customItems;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

public class NinjaStickItem extends Item {
    public NinjaStickItem(Item.Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext e) {
        Player p = e.getPlayer();
        if(!(p == null)){
            p.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 300, 3));
            e.getItemInHand().hurtAndBreak(1, p,
                    player -> player.broadcastBreakEvent(player.getUsedItemHand()));
            p.getCooldowns().addCooldown(this, 500);
        }

        return InteractionResult.SUCCESS;
    }
    

}
