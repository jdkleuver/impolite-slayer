package com.ImpoliteSlayer;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("impolite-slayer")
public interface ImpoliteSlayerConfig extends Config
{
	@ConfigItem(
		keyName = "badTasks",
		name = "Bad Tasks",
		description = "Tasks that make you angry when you are assigned them!"
	)
	default String badTasks()
	{
		return "Waterfiends,Fossil Island Wyverns,Adamant Dragons,Red Dragons,Elves,Steel Dragons,Spiritual Creatures,Iron Dragons";
	}
	@ConfigItem(
			keyName = "message",
			name = "Message",
			description = "What you'd like to say to a slayer master when you receive a bad task."
	)
	default String message()
	{
		return "Screw you!";
	}
}