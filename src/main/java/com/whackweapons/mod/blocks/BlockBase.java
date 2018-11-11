package com.whackweapons.mod.blocks;

import com.whackweapons.mod.WhackWeapons;
import com.whackweapons.mod.items.CustomItems;
import com.whackweapons.mod.rendering.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.oredict.OreDictionary;

public class BlockBase extends Block implements IHasModel
{
	private String oreDictName;
	
	public BlockBase(String name, Material materialIn)
	{
		super(materialIn);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		CustomBlocks.add(this);
		CustomItems.addItem(new ItemBlock(this).setRegistryName(getRegistryName()));
	}
	
	public BlockBase(String name, Material materialIn, String oreDictName)
	{
		this(name, materialIn);
		
		this.oreDictName = oreDictName;
	}

	@Override
	public void registerModels()
	{
		WhackWeapons.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	public boolean shouldBeOreDictRegistered() { return oreDictName != null; }
	public void registerInOreDict()
	{
		OreDictionary.registerOre(oreDictName, this);
	}
}
