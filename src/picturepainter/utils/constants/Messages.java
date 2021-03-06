package picturepainter.utils.constants;

import org.bukkit.command.CommandSender;

public class Messages {

	//IMAGE READING
	public static void image_not_readable(CommandSender sender) {
		sender.sendMessage("Image cannot be read or does not exist.");
		sender.sendMessage("Make sure image file is in server directory and either jpeg or png.");
	}
	
	public static void image_successfully_read(CommandSender sender) {
		sender.sendMessage("Image successfully read and added to stage.");
	}
	
	//STAGE
	public static void stage_empty(CommandSender sender) {
		sender.sendMessage("Stage is empty!");
		sender.sendMessage("Add an image to the stage to continue!");
	}
	
	public static void stage_cleared(CommandSender sender) {
		sender.sendMessage("Stage has been cleared!");
	}
	
	//IMAGE DRAWING
	public static void buffer_start(CommandSender sender) {
		sender.sendMessage("Loading image...");
	}
	
	public static void buffer_end(CommandSender sender) {
		sender.sendMessage("Buffer Complete!");
	}
	
	public static void drawing_start(CommandSender sender) {
		sender.sendMessage("Started Drawing!");
	}
	
	public static void drawing_end(CommandSender sender) {
		sender.sendMessage("Drawing complete!");
	}
}
