package com.whackweapons.mod.enchantments;

import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import com.whackweapons.mod.util.Reference;

@Mod.EventBusSubscriber(modid=Reference.MODID)
public class CustomEnchantments
{
	public static final Enchantment EGG_ENCHANTMENT = new EggEnchantment();

	@SubscribeEvent
	public void registerEnchantments(Register<Enchantment> event)
	{
		System.out.println("Here I am!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		event.getRegistry().register(EGG_ENCHANTMENT);
	}
}
