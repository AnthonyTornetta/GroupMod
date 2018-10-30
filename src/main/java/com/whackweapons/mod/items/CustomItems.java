package com.whackweapons.mod.items;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;

public class CustomItems
{
	public static final List<Item> ITEMS = new ArrayList<>();
	
	public static final Item TEST_ITEM = new ItemBase("TEST_ITEM");

	public static void addItem(Item i) { ITEMS.add(i); }
}
