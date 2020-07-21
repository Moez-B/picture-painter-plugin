package picturepainter.commands;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import picturepainter.PicturePainter;
import picturepainter.utils.Messages;
import picturepainter.utils.image.EditImage;

public class SetImageCommand implements CommandExecutor {
	
	public PicturePainter plugin;
	
	public SetImageCommand(PicturePainter p) {
		this.plugin = p;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String str, String[] args) {
		
		int nHeight = (int)(256 - ((Player)sender).getLocation().getY());
		int nWidth = 0;
		double scale;
		
		try {
			this.plugin.image = ImageIO.read(new File(args[0]));
			scale = nHeight / this.plugin.image.getHeight();
			nWidth = (int)(this.plugin.image.getWidth() * scale);
			this.plugin.image = EditImage.resize(this.plugin.image, nHeight, nWidth);
			
			Messages.image_successfully_read(sender);
		}
		catch(IOException e) {
			Messages.image_not_readable(sender);
			return false;
		}
		return true;
	}
	
}
