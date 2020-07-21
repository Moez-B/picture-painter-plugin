package picturepainter;

import java.awt.image.BufferedImage;

import org.bukkit.Location;

public class Stage {

	public BufferedImage image;
	public String imageName;
	public Location start;
	
	public Stage(BufferedImage image, String imageName, Location start) {
		this.image = image;
		this.imageName = imageName;
		this.start = start;
	}
	
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	
	public void setImageName(String name) {
		this.imageName = name;
	}
	
	public void setLocation(Location location) {
		this.start = location;
	}
	
	public void clearStage() {
		this.image = null;
		this.imageName = null;
		this.start = null;
	}
	
}
