package picturepainter.conversion;

import java.awt.Color;

import org.bukkit.Material;

public enum Wools {
	
	WHITE(Material.WHITE_WOOL, new Color(255, 255, 255)),
	ORANGE(Material.ORANGE_WOOL, new Color(255, 102, 0)),
	MAGENTA(Material.MAGENTA_WOOL, new Color(255, 0, 255)),
	YELLOW(Material.YELLOW_WOOL, new Color(255, 255, 0)),
	BLUE(Material.BLUE_WOOL, new Color(0, 0, 255)),
	LIGHT_BLUE(Material.LIGHT_BLUE_WOOL, new Color(0, 217, 255)),
	GREEN(Material.GREEN_WOOL, new Color(0, 255, 0)),
	LIME(Material.LIME_WOOL, new Color(125, 255, 0)),
	PINK(Material.PINK_WOOL, new Color(255, 192, 203)),
	GRAY(Material.GRAY_WOOL, new Color(128, 128, 128)),
	LIGHT_GRAY(Material.LIGHT_GRAY_WOOL, new Color(211, 211, 211)),
	CYAN(Material.CYAN_WOOL, new Color(0, 255, 255)),
	PURPLE(Material.PURPLE_WOOL, new Color(128, 0, 128)),
	BROWN(Material.BROWN_WOOL, new Color(139, 69, 19)),
	RED(Material.RED_WOOL, new Color(255, 0, 0)),
	BLACK(Material.BLACK_WOOL, new Color(0, 0, 0));
	
	public Color color;
	public Material block;
	
	private Wools(Material block, Color color) {
		this.block = block;
		this.color = color;
	}
	
}
