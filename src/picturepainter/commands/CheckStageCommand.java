package picturepainter.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import picturepainter.PicturePainter;
import picturepainter.utils.constants.Messages;

public class CheckStageCommand implements CommandExecutor {

	private PicturePainter plugin;
	
	public CheckStageCommand(PicturePainter p) {
		this.plugin = p;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String str, String[] args) {
		if(this.plugin.stage.image == null) {
			Messages.stage_empty(sender);
			return false;
		}
		else {
			sender.sendMessage(this.plugin.stage.imageName + " is the stage.");
		}
		return true;
	}
}
