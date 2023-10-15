package com.ImpoliteSlayer;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("example")
public interface ImpoliteSlayerConfig extends Config
{
	@ConfigItem(
		keyName = "badTasks",
		name = "Bad Tasks",
		description = "TTasks that make you angry when you are assigned them!"
	)
	default String badTasks()
	{
		return "Waterfiends,Fossil Island Wyverns,Adamant Dragons,Red Dragons,Elves,Steel Dragons,Spiritual Creatures,Iron dragons";
	}
}
