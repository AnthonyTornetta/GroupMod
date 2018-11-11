package com.whackweapons.mod.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.fml.common.Mod;

public class EggEnchantment extends Enchantment
{
	protected EggEnchantment()
	{
		super(Rarity.COMMON, EnumEnchantmentType.WEAPON, new EntityEquipmentSlot[] {EntityEquipmentSlot.MAINHAND});
		
		setRegistryName("EGG_ENCHANTMENT");
		setName("EGG_ENCHANTMENT");
	}
	
    /**
     * Called whenever a mob is damaged with an item that has this enchantment on it.
     */
    public void onEntityDamaged(EntityLivingBase user, Entity target, int level)
    {
    	BigChicken eggert = new BigChicken(user.world);
    	eggert.posX = target.posX;
    	eggert.posY = target.posY;
    	eggert.posZ = target.posZ;
    	eggert.motionY = 5;
    	user.world.spawnEntity(eggert);
    }
}
