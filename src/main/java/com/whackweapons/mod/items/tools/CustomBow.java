package com.whackweapons.mod.items.tools;

import com.whackweapons.mod.items.CustomSword;

import net.minecraft.client.particle.ParticleBreaking.SnowballFactory;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemSnowball;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class CustomBow extends ItemBow
{
	public CustomBow()
	{
		setRegistryName("CUSTOM_BOW");
		setUnlocalizedName("CUSTOM_BOW");
		
		CustomItems.addItem(this);
		setCreativeTab(CreativeTabs.COMBAT);
	}
    
	@Override
	protected boolean isArrow(ItemStack stack)
	{
		return stack.getItem() instanceof ItemSnowball;
	}
}
