package com.whackweapons.mod.enchantments;

import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.world.World;

public class BigChicken extends EntityChicken
{
	public BigChicken(World worldIn)
	{
		super(worldIn);
		this.setSize(0.6f, 10.5f);
	}
}
