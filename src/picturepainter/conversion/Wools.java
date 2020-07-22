package picturepainter.conversion;

import java.awt.Color;

import org.bukkit.Material;

public enum Wools {
	
	WHITE_WOOL(Material.WHITE_WOOL, new Color(255, 255, 255)),
	ORANGE_WOOL(Material.ORANGE_WOOL, new Color(255, 102, 0)),
	MAGENTA_WOOL(Material.MAGENTA_WOOL, new Color(255, 0, 255)),
	YELLOW_WOOL(Material.YELLOW_WOOL, new Color(255, 255, 0)),
	BLUE_WOOL(Material.BLUE_WOOL, new Color(0, 0, 255)),
	LIGHT_BLUE_WOOL(Material.LIGHT_BLUE_WOOL, new Color(0, 217, 255)),
	GREEN_WOOL(Material.GREEN_WOOL, new Color(0, 255, 0)),
	LIME_WOOL(Material.LIME_WOOL, new Color(125, 255, 0)),
	PINK_WOOL(Material.PINK_WOOL, new Color(255, 192, 203)),
	GRAY_WOOL(Material.GRAY_WOOL, new Color(128, 128, 128)),
	LIGHT_GRAY_WOOL(Material.LIGHT_GRAY_WOOL, new Color(211, 211, 211)),
	CYAN_WOOL(Material.CYAN_WOOL, new Color(0, 255, 255)),
	PURPLE_WOOL(Material.PURPLE_WOOL, new Color(128, 0, 128)),
	BROWN_WOOL(Material.BROWN_WOOL, new Color(139, 69, 19)),
	RED_WOOL(Material.RED_WOOL, new Color(255, 0, 0)),
	BLACK_WOOL(Material.BLACK_WOOL, new Color(0, 0, 0)),
	;
	
	public Color color;
	public Material block;
	
	private Wools(Material block, Color color) {
		this.block = block;
		this.color = color;
	}
	
}
