package picturepainter;

import java.awt.image.BufferedImage;

import org.bukkit.Location;

public class Stage {

	public BufferedImage image;
	public Location start;
	
	public Stage(BufferedImage image, Location start) {
		this.image = image;
		this.start = start;
	}
	
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	
	public void setLocation(Location location) {
		this.start = location;
	}
}
