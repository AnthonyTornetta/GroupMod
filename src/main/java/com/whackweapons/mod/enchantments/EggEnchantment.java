package com.whackweapons.mod.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
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
	@Override
    public void onEntityDamaged(EntityLivingBase user, Entity target, int level)
    {
		System.out.println("ASDF");
    	EntityChicken eggert = new EntityChicken(user.world);
    	eggert.setScaleForAge(true);
    	eggert.posX = target.posX;
    	eggert.posY = target.posY;
    	eggert.posZ = target.posZ;
    	eggert.motionY = 5;
    	if(user.world.spawnEntity(eggert))
    		System.out.println("Ayyye");
    	else
    		System.out.println("Neeee");
    }
}
