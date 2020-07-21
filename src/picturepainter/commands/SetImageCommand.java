package picturepainter.commands;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import picturepainter.PicturePainter;
import picturepainter.utils.constants.Messages;
import picturepainter.utils.constants.NumericConstants;
import picturepainter.utils.image.EditImage;

public class SetImageCommand implements CommandExecutor {
	
	private PicturePainter plugin;
	
	public SetImageCommand(PicturePainter p) {
		this.plugin = p;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String str, String[] args) {
		
		int nHeight = (int)(NumericConstants.HEIGHT_LIMIT - ((Player)sender).getLocation().getY());
		int nWidth = 0;
		double scale;
		
		try {
			this.plugin.stage.setImage(ImageIO.read(new File(args[0])));
			this.plugin.stage.setImageName(args[0]);
			
			scale = nHeight / this.plugin.stage.image.getHeight();
			nWidth = (int)(this.plugin.stage.image.getWidth() * scale);
			this.plugin.stage.setImage(EditImage.resize(this.plugin.stage.image, nHeight, nWidth));
			
			this.plugin.stage.setLocation(((Player)sender).getLocation());
			
			Messages.image_successfully_read(sender);
		}
		catch(IOException e) {
			Messages.image_not_readable(sender);
			return false;
		}
		return true;
	}
	
}
