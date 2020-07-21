package picturepainter;

import org.bukkit.plugin.java.JavaPlugin;

import picturepainter.commands.CheckStageCommand;
import picturepainter.commands.ClearStageCommand;
import picturepainter.commands.SetImageCommand;
import picturepainter.commands.draw.DrawCommand;

public class PicturePainter extends JavaPlugin {
	
	public Stage stage = new Stage(null, null, null);
	
	@Override
	public void onEnable() {
		this.getCommand("stage").setExecutor(new CheckStageCommand(this));
		this.getCommand("clearstage").setExecutor(new ClearStageCommand(this));
		this.getCommand("setimage").setExecutor(new SetImageCommand(this));
		this.getCommand("draw").setExecutor(new DrawCommand(this));
		
	}
	
	@Override
	public void onDisable() {}
	
}
