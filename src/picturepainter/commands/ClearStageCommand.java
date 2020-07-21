package picturepainter.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import picturepainter.PicturePainter;
import picturepainter.utils.constants.Messages;

public class ClearStageCommand implements CommandExecutor {
	
	private PicturePainter plugin;
	
	public ClearStageCommand(PicturePainter p) {
		this.plugin = p;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String str, String[] args) {
		this.plugin.stage.clearStage();
		Messages.stage_cleared(sender);
		return true;
	}

}
