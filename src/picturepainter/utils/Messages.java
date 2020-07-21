package picturepainter.utils;

import org.bukkit.command.CommandSender;

public class Messages {

	public static void image_not_readable(CommandSender sender) {
		sender.sendMessage("Image cannot be read or does not exist.");
		sender.sendMessage("Make sure image file is in server directory and either jpeg or png.");
	}
	
	public static void image_successfully_read(CommandSender sender) {
		sender.sendMessage("Image successfully read and added to stage.");
	}
}
