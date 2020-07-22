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
	WHITE_TC(Material.WHITE_TERRACOTTA, new Color(205, 176, 162)),
	ORANGE_TC(Material.ORANGE_TERRACOTTA, new Color(159, 78, 28)),
	MAGENTA_TC(Material.MAGENTA_TERRACOTTA, new Color(148, 83, 105)),
	LIGHT_BLUE_TC(Material.LIGHT_BLUE_TERRACOTTA, new Color(110, 107, 135)),
	YELLOW_TC(Material.YELLOW_TERRACOTTA, new Color(185, 132, 25)),
	LIME_TC(Material.LIME_TERRACOTTA, new Color(97, 113, 43)),
	PINK_TC(Material.PINK_TERRACOTTA, new Color(160, 74, 78)),
	GRAY_TC(Material.GRAY_TERRACOTTA, new Color(54, 34, 28)),
	LIGHT_GRAY_TC(Material.LIGHT_GRAY_TERRACOTTA, new Color(133, 105, 93)),
	CYAN_TC(Material.CYAN_TERRACOTTA, new Color(82, 88, 88)),
	PURPLE_TC(Material.PURPLE_TERRACOTTA, new Color(116, 65, 82)),
	BLUE_TC(Material.BLUE_TERRACOTTA, new Color(116, 65, 82)),
	BROWN_TC(Material.BROWN_TERRACOTTA, new Color(76, 44, 24)),
	GREEN_TC(Material.GREEN_TERRACOTTA, new Color(76, 44, 24)),
	RED_TC(Material.RED_TERRACOTTA, new Color(76, 44, 24)),
	BLACK_TC(Material.BLACK_TERRACOTTA, new Color(28, 12, 6)),
	TC(Material.TERRACOTTA, new Color(124, 63, 52));
	
	public Color color;
	public Material block;
	
	private Wools(Material block, Color color) {
		this.block = block;
		this.color = color;
	}
	
}
