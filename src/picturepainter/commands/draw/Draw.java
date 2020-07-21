package picturepainter.commands.draw;

import java.awt.Color;
import java.awt.image.BufferedImage;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import picturepainter.conversion.Convert;
import picturepainter.utils.constants.Messages;

public class Draw {

	public static void draw(CommandSender sender, BufferedImage image, int height, int width) {
		
		Player p = (Player)sender;
		Material[][] blocks = buffer(sender, image, height, width);
		
		Messages.drawing_start(sender);
		
		World world = Bukkit.getWorld("world");
		
		int startY = (int)p.getLocation().getY() + height;
		int startX = (int)p.getLocation().getX();
		int startZ = (int)p.getLocation().getZ();
		
		for(int y = 0; y < height; ++y) {
			for(int x = 0; x < width; ++x) {
				new Location(world, startX + (double)x, startY - (double)y, (double)startZ).getBlock().setType(blocks[y][x]);
			}
		}		
		
		Messages.drawing_end(sender);	
	}
	
	public static Material[][] buffer(CommandSender sender, BufferedImage image, int height, int width) {
		Messages.buffer_start(sender);
		
		Material[][] blocks = new Material[height][width];
		int total = height*width;
		
		for(int y = 0; y < height; ++y) {
			for(int x = 0; x < width; ++x) {
				blocks[y][x] = Convert.convert(new Color(image.getRGB(x, y)));
				sender.sendMessage(((y*width) + x) + "/" + total + " completed...");
			}
		}
		
		Messages.buffer_end(sender);
		return blocks;
	}
	
}
