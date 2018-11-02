package com.whackweapons.mod.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class CustomWorldGeneration implements IWorldGenerator
{
	private static class OreProperties
	{
		Block b;
		int minSize, maxSize, chance;
		int minY, maxY;
	}
	
	private static List<OreProperties> ores = new ArrayList<>();
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		if(world.provider.getDimension() == 0)
		{
			// We're in the overworld
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		for(OreProperties p : ores)
		{
			generateOre(p.b.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, p.minY, p.maxY, random.nextInt(p.maxSize - p.minSize) + p.minSize, p.chance);
		}
	}
	
	private void generateOre(IBlockState ore, World world, Random rdm, int x, int z, int minY, int maxY, int size, int chances)
	{
		int deltaY = maxY - minY;
		
		for(int i = 0; i < chances; i++)
		{
			BlockPos pos = new BlockPos(x + rdm.nextInt(16), minY + rdm.nextInt(deltaY), z + rdm.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, rdm, pos);
		}
	}
	
	/**
	 * Adds an ore to be generated to the world
	 * @param b
	 * @param minSpawnSize
	 * @param maxSpawnSize
	 * @param minY
	 * @param maxY
	 * @param chance
	 */
	public static void addOre(Block b, int minSpawnSize, int maxSpawnSize, int minY, int maxY, int chance)
	{
		OreProperties props = new OreProperties();
		props.b = b;
		props.chance = chance;
		props.minSize = Math.min(minSpawnSize, maxSpawnSize);
		props.maxSize = Math.max(minSpawnSize, maxSpawnSize);
		props.minY = minY;
		props.maxY = maxY;
		
		ores.add(props);
	}
}
