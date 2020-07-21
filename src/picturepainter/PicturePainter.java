package picturepainter;

import java.awt.image.BufferedImage;

import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

public class PicturePainter extends JavaPlugin {
	
	public Stage stage = new Stage(null, null);
	
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {}
	
}
